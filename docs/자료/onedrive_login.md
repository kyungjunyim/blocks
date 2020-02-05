# OneDrive
https://docs.microsoft.com/ko-kr/azure/active-directory/develop/active-directory-v2-protocols#endpoints
https://docs.microsoft.com/en-us/graph/auth-v2-user


https://docs.microsoft.com/en-us/azure/active-directory/develop/scenario-web-app-call-api-overview <<<<이거다!!>>>>

https://github.com/Azure-Samples/ms-identity-java-webapp

## 인증 프로토콜

### 앱 등록
개인 및 회사 또는 학교 계정을 모두 허용 하려는 모든 앱은 Azure Portal 앱 등록 환경을 통해 등록 해야 합니다 .이를 통해 OAuth 2.0 또는 openid connect Connect를 사용 하 여에서 이러한 사용자에 게 로그인 할 수 있습니다. 앱 등록 프로세스는 몇 개의 값을 수집하고 앱에 할당합니다.

*   앱을 고유하게 식별하는 애플리케이션 ID
*   응답을 다시 앱으로 보내는 데 사용할 수 있는 리디렉션 URI(선택사항)
*   다른 몇 가지 시나리오 관련 값.

자세한 내용은 [앱 등록](https://docs.microsoft.com/ko-kr/azure/active-directory/develop/quickstart-register-app) 방법을 참조하세요.

### 권한 얻기
앱이 등록되면 엔드포인트에 요청을 전송하여 Microsoft id 플랫폼과 통신합니다.

    https://login.microsoftonline.com/{tenant}/oauth2/v2.0/authorize
    https://login.microsoftonline.com/{tenant}/oauth2/v2.0/token

여기서 `{tenant}` 는 네 개의 서로 다른 값 중 하나를 가질 수 있습니다.

|값|설명|
|---|---|
|`common`|개인 Microsoft 계정과 Azure AD의 회사/학교 계정이 모두 있는 사용자가 애플리케이션에 로그인할 수 있습니다.|
|`organizations`|Azure AD의 회사/학교 계정이 있는 사용자만 애플리케이션에 로그인할 수 있습니다.있습니다.|
|`consumers`|개인 Microsoft 계정(MSA)이 있는 사용자만이 애플리케이션에 로그인 할 수 있습니다.
|`8eaef023-2b34-4da1-9baa-8bc8c9d6a490 또는 contoso.onmicrosoft.com`|특정 Azure AD 테넌트의 회사/학교 계정이 있는 사용자만 애플리케이션에 로그인할 수 있습니다. Azure AD 테넌트의 친숙한 도메인 이름 또는 테넌트의 GUID 식별자를 사용할 수 있습니다.|

consumers 사용하면 될듯..

#### 파라미터들
|파라미터|필수 여부|설명|
--|--|--
|tenant|필수|위 설명 참조|
|client_id|필수|등록한 앱의 아이디|
|response_type|필수|`code`로 주자|
|redirect_uri|권장|앱에서 인증 응답을 보내고 받을 수 있는 앱의 uri. 반드시 URL로 인코딩되어야 하며 앱 등록 포털에 등록한 redirect_uris 중 하나와 정확히 일치해야함. 디폴트 값: https://login.microsoftonline.com/common/oauth2/nativeclient.|
|scope|필수|사용자가 동의 할 공백으로 구분된 권한 목록|
|response_mode|권장|결과 토큰을 앱으로 다시 보내는 데 사용해야하는 방법을 지정함. `query` 또는 `form_post`|
|state|권장|요청에 포함된 값으로 올바른 통신인지 확인하는 데 사용.

#### 예제
    https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize?client_id=a8c9dc08-121d-437c-ac05-b91eedb66fef
    &response_type=code
    &response_mode=query
    &scope=email%20user.read%20mail.read%20files.readwrite.all
    &state=12345

#### 권한 응답(요청을 보내고 응답 결과)
|파라미터|설명|
|-|-|
|code|앱이 요청한 권한 코드값. 앱은 인증 코드를 사용하여 대상 리소스에 대한 액세스 토큰을 요청할 수 있다. 코드 값은 수명이 매우 짧으며 일반적으로 약 10분 후 에 만료된다.|
|state|요청에 state 값을 지정했다면 동일한 값이 응답 결과에 포함된다. 앱은 요청 및 응답의 상태 값이 동일한 지 확인해야한다.|

### 토큰 얻기
이전 단계에서 액세스 토큰을 요청하기 위한 `code`값을 받았다. 액세스 토큰은 `POST`로 `/token` 엔드포인트로 요청한다.

#### 토큰 요청

요청 주소:  https://login.microsoftonline.com/consumers/oauth2/v2.0/token

Content-Type: application/x-www-form-urlencoded

폼 구성요소

파라미터|필수 여부|설명
-|-|-
|tenant|필수
|client_id|필수
|grant_type|필수
|redirect_uri|권장(검증용 Uri)
|scope|필수
|client_secret|웹앱에서는 필수
|code|필수

클라이언트 암호: MMf=77Sz]?/tFs3SjJF2NTNifnrV:vRl

CGspvw5N@s:tD.4/kwAMHUuB6DvXVL1I



