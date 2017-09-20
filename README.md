# Amigo

do you have freestyle?

local: yes

1、首先通过如http://localhost:8080/chapter17-server/authorize

?client_id=c1ebe466-1cdc-4bd3-ab69-77c3561b9dee&response_type=code&redirect_uri=http://localhost:9080/chapter17-client/oauth2-login访问授权页面；

2、该控制器首先检查clientId是否正确；如果错误将返回相应的错误信息；

3、然后判断用户是否登录了，如果没有登录首先到登录页面登录；

4、登录成功后生成相应的auth code即授权码，然后重定向到客户端地址，如http://localhost:9080/chapter17-client/oauth2-login?code=52b1832f5dff68122f4f00ae995da0ed；在重定向到的地址中会带上code参数（授权码），接着客户端可以根据授权码去换取access token。


1、首先通过如http://localhost:8080/chapter17-server/accessToken，POST提交如下数据：client_id=c1ebe466-1cdc-4bd3-ab69-77c3561b9dee&client_secret=d8346ea2-6017-43ed-ad68-19c0f971738b&grant_type=authorization_code&code=828beda907066d058584f37bcfd597b6&redirect_uri=http://localhost:9080/chapter17-client/oauth2-login访问；

2、该控制器会验证client_id、client_secret、auth code的正确性，如果错误会返回相应的错误；

3、如果验证通过会生成并返回相应的访问令牌access token。


1、首先通过如http://localhost:8080/chapter17-server/userInfo? access_token=828beda907066d058584f37bcfd597b6进行访问；

2、该控制器会验证access token的有效性；如果无效了将返回相应的错误，客户端再重新进行授权；

3、如果有效，则返回当前登录用户的用户名。