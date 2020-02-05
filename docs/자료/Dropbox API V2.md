## Dropbox API V2

HTTP/REST 기반 API

상세 참조 : https://www.dropbox.com/developers/documentation/http/documentation

---

앱 권한 종류

- 무엇을 쓸것인가??

https://www.dropbox.com/developers/reference/developer-guide?_tk=support_lp&_ad=faq8&_camp=reference

---

API  Summary

Authorization

* oauth2/authorize
  * Method : GET
  * URL : oauth2/authorize
  * Parameter : response_type, client_id, redirect_uri, state, require_role, force_reapprove, disable_signup, locale, force_reauthentication
  * Return : void - 리다이렉트
* oauth2/token
  * Method : POST
  * URL : oauth2/token
  * Parameter : code, grant_type, client_id, client_secret, redirect_url
  * Return : 엑세스토큰, 토큰타입, 기타등등



file_properties 
*  파일 메타데이터 관련 API - 여기서 말하는 메타데이터가 뭔지 잘 모르겠음I

file_requests
* 파일 요청에 대한 조작 관련 API

files
* 파일 조작 관련 API
	* 디렉토리 조작, 파일 조작 ...

sharings
* 공유 파일 관련 API

users
* 사용자 정보 관련 API



