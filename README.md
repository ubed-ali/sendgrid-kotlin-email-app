# Send Emails with SendGrid API using Micronaut with Kotlin Coroutines

## SendGrid API Key

To use the Micronaut Sendgrid integration, we need an API Key.

1. Sign up for SendGrid.
2. Generate API Key.

    SendGrid Account Settings > API Key > Create API key
    - Provide a name to API Key and set permissions accordingly. 
    - Store the generated API Key, as we'll need it later.
3. Verify Email Address on SendGrid.

    Settings > Sender Authentication
    
    Verify Single Sender > Create New Sender > Verify the email.
    

## Configuration
If you want to send every email with the same address, you can set it via configuration:
    
    Head to source/main/kotlin/resources/application.yml
    
    Add e-mail which we verified on SendGrid.
 
## Running the Application
### A. API Key

  Set the SendGrid API Key as an environment variable before you run the application:
  
  `$ export SENDGRID_API_KEY='yourApiKey'`

### B. Run

  Run the application using following command
  `./gradlew run`
