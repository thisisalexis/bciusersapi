bciusersapi

This is an application that exposes an User API what is used to create and persist users ant its information

Download:

Go to your git bash and clone the source code of the project by typing:

git clone https://github.com/thisisalexis/bciusersapi.git

Generate executable:

- From shell (command line), go to the root of the project you just downloaded. 
- Execute the next command from shell or command line: gradlew bootJar. This action should have created the file build/libs/bciuserapi-0.0.1-SNAPSHOT.jar in the project 
- From command line (in the root directory of the project) execute the next command: java -jar build/libs/bciuserapi-0.0.1-SNAPSHOT.jar 
- After this, the application should have started at 8098 port (If required, you can change that port in the application-dev.properties file, by editing the server.port property) 
- Now you are ready to use the exposed endpoints; follow the instructions in the next section to do so.

SEE THE WORKING APPLICATION AND API DOCUMENTATION

- Enter to http://localhost:8098/bci/swagger-ui.html and there you'll see the endpoint exposed by the application and its documentation (If you set another port, consider to change it here)


USING THE APPLICATION: Using add user endpoint

- Enter to http://localhost:8098/bci/swagger-ui.html and there you'll see the endpoint exposed by the application
- Select the "POST /user/sign-up" endpoint
- To test this endpoint, you are going to be required to send a body; you can use the next example:

{
  "email": "alexis.ve@gmail.com",
  "name": "Alexis Bravo",
  "password": "123456",
  "phones": [
    {
      "city_code": 0,
      "country_code": 0,
      "number": "23423424"
    },
    {
      "city_code": 0,
      "country_code": 0,
      "number": "12341234234444"
    }
  ]
}

- If everything went ok, now you are going to be able to check the response with just created user information.

CHECK DATA BASE:

- To check database go to http://localhost:8098/bci/h2-console
- In the user input, put sa
- In the password input, put 123456
- If everything went ok, now you are going to be able to check database structure and data

ABOUT THE COMMONS LIBRARY (https://github.com/thisisalexis/common)

This project is using an external commons library which is also part of the source code of the application but is maintained in a separate repository to facilitate its reuse.

https://github.com/thisisalexis/common

If you want to see commons library source code, follow the next steps:

- Open your git shell
- Type git clone https://github.com/thisisalexis/common.git
- That's all! You can check the code of the library.