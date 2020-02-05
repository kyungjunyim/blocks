## Google Drive API

This API reference is organized by resource type. Each resource type has one or more data representations and one or more methods.

Resource types

**About**

For About Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/about#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request | Description                                                  |
| :----------------------------------------------------------- | :----------- | :----------------------------------------------------------- |
| [get](https://developers.google.com/drive/api/v3/reference/about/get) | `GET /about` | Gets information about the user, the user's Drive, and system capabilities.**Required query parameters:** `fields` |

**Changes**

For Changes Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/changes#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                  | Description                                                  |
| :----------------------------------------------------------- | :---------------------------- | :----------------------------------------------------------- |
| [getStartPageToken](https://developers.google.com/drive/api/v3/reference/changes/getStartPageToken) | `GET /changes/startPageToken` | Gets the starting pageToken for listing future changes.      |
| [list](https://developers.google.com/drive/api/v3/reference/changes/list) | `GET /changes`                | Lists the changes for a user or shared drive.**Required query parameters:** `pageToken` |
| [watch](https://developers.google.com/drive/api/v3/reference/changes/watch) | `POST /changes/watch`         | Subscribes to changes for a user.                            |

**Channels**

For Channels Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/channels#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request          | Description                                  |
| :----------------------------------------------------------- | :-------------------- | :------------------------------------------- |
| [stop](https://developers.google.com/drive/api/v3/reference/channels/stop) | `POST /channels/stop` | Stop watching resources through this channel |

**Comments**

For Comments Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/comments#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                              | Description                                                  |
| :----------------------------------------------------------- | :---------------------------------------- | :----------------------------------------------------------- |
| [create](https://developers.google.com/drive/api/v3/reference/comments/create) | `POST /files/fileId/comments`             | Creates a new comment on a file.**Required query parameters:** `fields` |
| [delete](https://developers.google.com/drive/api/v3/reference/comments/delete) | `DELETE /files/fileId/comments/commentId` | Deletes a comment.                                           |
| [get](https://developers.google.com/drive/api/v3/reference/comments/get) | `GET /files/fileId/comments/commentId`    | Gets a comment by ID.**Required query parameters:** `fields` |
| [list](https://developers.google.com/drive/api/v3/reference/comments/list) | `GET /files/fileId/comments`              | Lists a file's comments.**Required query parameters:** `fields` |
| [update](https://developers.google.com/drive/api/v3/reference/comments/update) | `PATCH /files/fileId/comments/commentId`  | Updates a comment with patch semantics.**Required query parameters:** `fields` |

**Files**

For Files Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/files#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                                                 | Description                                                  |
| :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| [copy](https://developers.google.com/drive/api/v3/reference/files/copy) | `POST /files/fileId/copy`                                    | Creates a copy of a file and applies any requested updates with patch semantics. |
| [create](https://developers.google.com/drive/api/v3/reference/files/create) | `POSThttps://www.googleapis.com/upload/drive/v3/files` and `POST /files` | Creates a new file.                                          |
| [delete](https://developers.google.com/drive/api/v3/reference/files/delete) | `DELETE /files/fileId`                                       | Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a shared drive the user must be an organizer on the parent. If the target is a folder, all descendants owned by the user are also deleted. |
| [emptyTrash](https://developers.google.com/drive/api/v3/reference/files/emptyTrash) | `DELETE /files/trash`                                        | Permanently deletes all of the user's trashed files.         |
| [export](https://developers.google.com/drive/api/v3/reference/files/export) | `GET /files/fileId/export`                                   | Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB.**Required query parameters:** `mimeType` |
| [generateIds](https://developers.google.com/drive/api/v3/reference/files/generateIds) | `GET /files/generateIds`                                     | Generates a set of file IDs which can be provided in create or copy requests. |
| [get](https://developers.google.com/drive/api/v3/reference/files/get) | `GET /files/fileId`                                          | Gets a file's metadata or content by ID.                     |
| [list](https://developers.google.com/drive/api/v3/reference/files/list) | `GET /files`                                                 | Lists or searches files.                                     |
| [update](https://developers.google.com/drive/api/v3/reference/files/update) | `PATCHhttps://www.googleapis.com/upload/drive/v3/files/fileId` and `PATCH /files/fileId` | Updates a file's metadata and/or content with patch semantics. |
| [watch](https://developers.google.com/drive/api/v3/reference/files/watch) | `POST /files/fileId/watch`                                   | Subscribes to changes to a file                              |

**Permissions**

For Permissions Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/permissions#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                                    | Description                                      |
| :----------------------------------------------------------- | :---------------------------------------------- | :----------------------------------------------- |
| [create](https://developers.google.com/drive/api/v3/reference/permissions/create) | `POST /files/fileId/permissions`                | Creates a permission for a file or shared drive. |
| [delete](https://developers.google.com/drive/api/v3/reference/permissions/delete) | `DELETE /files/fileId/permissions/permissionId` | Deletes a permission.                            |
| [get](https://developers.google.com/drive/api/v3/reference/permissions/get) | `GET /files/fileId/permissions/permissionId`    | Gets a permission by ID.                         |
| [list](https://developers.google.com/drive/api/v3/reference/permissions/list) | `GET /files/fileId/permissions`                 | Lists a file's or shared drive's permissions.    |
| [update](https://developers.google.com/drive/api/v3/reference/permissions/update) | `PATCH /files/fileId/permissions/permissionId`  | Updates a permission with patch semantics.       |

**Replies**

For Replies Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/replies#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                                              | Description                                                  |
| :----------------------------------------------------------- | :-------------------------------------------------------- | :----------------------------------------------------------- |
| [create](https://developers.google.com/drive/api/v3/reference/replies/create) | `POST /files/fileId/comments/commentId/replies`           | Creates a new reply to a comment.**Required query parameters:** `fields` |
| [delete](https://developers.google.com/drive/api/v3/reference/replies/delete) | `DELETE /files/fileId/comments/commentId/replies/replyId` | Deletes a reply.                                             |
| [get](https://developers.google.com/drive/api/v3/reference/replies/get) | `GET /files/fileId/comments/commentId/replies/replyId`    | Gets a reply by ID.**Required query parameters:** `fields`   |
| [list](https://developers.google.com/drive/api/v3/reference/replies/list) | `GET /files/fileId/comments/commentId/replies`            | Lists a comment's replies.**Required query parameters:** `fields` |
| [update](https://developers.google.com/drive/api/v3/reference/replies/update) | `PATCH /files/fileId/comments/commentId/replies/replyId`  | Updates a reply with patch semantics.**Required query parameters:** `fields` |

**Revisions**

For Revisions Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/revisions#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                                | Description                                                  |
| :----------------------------------------------------------- | :------------------------------------------ | :----------------------------------------------------------- |
| [delete](https://developers.google.com/drive/api/v3/reference/revisions/delete) | `DELETE /files/fileId/revisions/revisionId` | Permanently deletes a file version. You can only delete revisions for files with binary content in Google Drive, like images or videos. Revisions for other files, like Google Docs or Sheets, and the last remaining file version can't be deleted. |
| [get](https://developers.google.com/drive/api/v3/reference/revisions/get) | `GET /files/fileId/revisions/revisionId`    | Gets a revision's metadata or content by ID.                 |
| [list](https://developers.google.com/drive/api/v3/reference/revisions/list) | `GET /files/fileId/revisions`               | Lists a file's revisions.                                    |
| [update](https://developers.google.com/drive/api/v3/reference/revisions/update) | `PATCH /files/fileId/revisions/revisionId`  | Updates a revision with patch semantics.                     |

**Drives**

For Drives Resource details, see the [resource representation](https://developers.google.com/drive/api/v3/reference/drives#resource) page.

URIs relative to https://www.googleapis.com/drive/v3, unless otherwise noted

| Method                                                       | HTTP request                  | Description                                                  |
| :----------------------------------------------------------- | :---------------------------- | :----------------------------------------------------------- |
| [create](https://developers.google.com/drive/api/v3/reference/drives/create) | `POST /drives`                | Creates a new shared drive.**Required query parameters:** `requestId` |
| [delete](https://developers.google.com/drive/api/v3/reference/drives/delete) | `DELETE /drives/driveId`      | Permanently deletes a shared drive for which the user is an organizer. The shared drive cannot contain any untrashed items. |
| [get](https://developers.google.com/drive/api/v3/reference/drives/get) | `GET /drives/driveId`         | Gets a shared drive's metadata by ID.                        |
| [hide](https://developers.google.com/drive/api/v3/reference/drives/hide) | `POST /drives/driveId/hide`   | Hides a shared drive from the default view.                  |
| [list](https://developers.google.com/drive/api/v3/reference/drives/list) | `GET /drives`                 | Lists the user's shared drives.                              |
| [unhide](https://developers.google.com/drive/api/v3/reference/drives/unhide) | `POST /drives/driveId/unhide` | Restores a shared drive to the default view.                 |
| [update](https://developers.google.com/drive/api/v3/reference/drives/update) | `PATCH /drives/driveId`       | Updates the metadate for a shared drive.                     |