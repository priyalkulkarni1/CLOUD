// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

FinalizeOAuth finalizeOAuthChoreo = new FinalizeOAuth(session);

// Get an InputSet object for the choreo
FinalizeOAuthInputSet finalizeOAuthInputs = finalizeOAuthChoreo.newInputSet();

// Set inputs

// Execute Choreo
FinalizeOAuthResultSet finalizeOAuthResults = finalizeOAuthChoreo.execute(finalizeOAuthInputs);