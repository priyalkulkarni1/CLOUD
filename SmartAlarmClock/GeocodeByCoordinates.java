// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

GeocodeByCoordinates geocodeByCoordinatesChoreo = new GeocodeByCoordinates(session);

// Get an InputSet object for the choreo
GeocodeByCoordinatesInputSet geocodeByCoordinatesInputs = geocodeByCoordinatesChoreo.newInputSet();

// Set credential to use for execution
geocodeByCoordinatesInputs.setCredential("Geocode");

// Set inputs

// Execute Choreo
GeocodeByCoordinatesResultSet geocodeByCoordinatesResults = geocodeByCoordinatesChoreo.execute(geocodeByCoordinatesInputs);