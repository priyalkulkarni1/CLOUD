// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

ByAddress byAddressChoreo = new ByAddress(session);

// Get an InputSet object for the choreo
ByAddressInputSet byAddressInputs = byAddressChoreo.newInputSet();

// Set credential to use for execution
byAddressInputs.setCredential("Weather");

// Set inputs

// Execute Choreo
ByAddressResultSet byAddressResults = byAddressChoreo.execute(byAddressInputs);