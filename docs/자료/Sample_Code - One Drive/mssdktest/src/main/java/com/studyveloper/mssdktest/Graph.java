package com.studyveloper.mssdktest;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Folder;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.requests.extensions.IEventCollectionPage;
/**
 * Graph
 */
public class Graph {

    private static IGraphServiceClient graphClient = null;
    private static SimpleAuthProvider authProvider = null;

    private static void ensureGraphClient(String accessToken) {
        if (graphClient == null) {
            // Create the auth provider
            authProvider = new SimpleAuthProvider(accessToken);

            // Create default logger to only log errors
            DefaultLogger logger = new DefaultLogger();
            logger.setLoggingLevel(LoggerLevel.ERROR);

            // Build a Graph client
            graphClient = GraphServiceClient.builder()
                .authenticationProvider(authProvider)
                .logger(logger)
                .buildClient();
        }
    }
    
    public static Drive getDrive(String accessToken) {
    	ensureGraphClient(accessToken);
    	
    	Drive drive = graphClient
    			.me().drive()
    			.buildRequest()
    			.get();
    	
    	return drive;
    }
    
    public static void getRootChildren() {
    	IDriveItemCollectionPage children = graphClient.me().drive().root().children()
    			.buildRequest()
    			.get();
    	
    	
    }
    
    public static void createNewFolder() {
    	IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

    	DriveItem driveItem = new DriveItem();
    	driveItem.name = "New Folder";
    	Folder folder = new Folder();
    	driveItem.folder = folder;
    	driveItem.additionalDataManager().put("@microsoft.graph.conflictBehavior", new JsonPrimitive("rename"));

    	graphClient.me().drive().root().children()
    		.buildRequest()
    		.post(driveItem);
    }

    public static User getUser(String accessToken) {
        ensureGraphClient(accessToken);

        // GET /me to get authenticated user
        
        
        User me = graphClient
            .me()
            .buildRequest()
            .get();

        return me;
    }
    public static List<Event> getEvents(String accessToken) {
        ensureGraphClient(accessToken);

        // Use QueryOption to specify the $orderby query parameter
        final List<Option> options = new LinkedList<Option>();
        // Sort results by createdDateTime, get newest first
        options.add(new QueryOption("orderby", "createdDateTime DESC"));

        // GET /me/events
        IEventCollectionPage eventPage = graphClient
            .me()
            .events()
            .buildRequest(options)
            .select("subject,organizer,start,end")
            .get();

        return eventPage.getCurrentPage();
    }
}