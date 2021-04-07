There are two microservices here:
* _facade-service_ - implemented on Kotlin
* _logging-service_

For _Service Discovery_ **_Consul_** is used.

Have found the following issues for _Native image_ generated from Kotlin microservice:
* doesn't support _**lateinit**_ for _HttpClient_ injection
* ignoring _Consul_ config at the configuration file
* should explicitly initilize at _build time_ or at _run time_ **_kotlin.ULong_**
