<!doctype html>
<html>
	<body>
		<h1>JavaScript Development</h1>

		<button type="button"
		onclick="document.getElementById('demo').innerHTML = Date()">
		Click me to display Date and Time.</button>
		<p id="demo"></p>

		<br />
			<span style="color: rgb(0, 0, 0); "><span style="font-size:10px;"><font face="Verdana">
			<a href="http://................./Forms/AllItems.aspx" 
			target="" title=""><strong><input name="btn01" type="button"                                         
			value="Start                   "   style="background-color:#336699; color:#fff;"              " 
			
			<span style="color: rgb(0, 0, 0); "><span style="font-size:10px;"><font face="Verdana">
			<a href="https://www.itsmschange.ford.com/arsys/forms/prodaruser.ford.com/SHR%3ALandingConsole/Default+Administrator+View/?cacheid=7af845d1" 
			target="" title=""><strong><input name="btn02" type="button" onclick="C:\PROJECTS\GitHub\ITIL\RunBMCjar.bat"                                         
			value="Open BMC                   "   style="background-color:#336699; color:#fff;"              " 
		/></strong></a></font></span></span></p><p> 
		<br />
			<span style="color: rgb(0, 0, 0); "><span style="font-size:10px;"><font face="Verdana">
			<a href="http://................./Forms/AllItems.aspx" 
			target="" title=""><strong><input name="btn03" type="button"                                         
			value="Get Wizard Feedback        "   style="background-color:#336699; color:#fff;"              " 
			
			<span style="color: rgb(0, 0, 0); "><span style="font-size:10px;"><font face="Verdana">
			<a href="https://rally1.rallydev.com/#/51575742627ud/workviews" 
			target="" title=""><strong><input name="btn04" type="button"                                         
			value="Open Rally                 "   style="background-color:#336699; color:#fff;"              " 
		/></strong></a></font></span></span></p><p>
		<br />
			<button class="btn btn-success" onclick=" window.open('http://google.com','_blank')"> Google</>button>
		<br />
			<p>Click the button to get a time-based greeting:</>
			<button class="btn btn-success" onclick="myFunction()">First javaScrip function call</>button>
			<p id="demo"></p>
		<script>
			function myFunction() {
			  var greeting;
			  var time = new Date().getHours();
			  if (time < 10) {
				greeting = "Good morning";
			  } else if (time < 20) {
				greeting = "Good day";
			  } else {
				greeting = "Good evening";
			  }
			  document.getElementById("demo").innerHTML = greeting;
			}
function retrieveListItems() {

    var clientContext = new SP.ClientContext('https://it1.spt.ford.com/sites/PDAM/IDTE/SignedDisclosures/');
    var oList = clientContext.get_web().get_lists().getByTitle(Title);
        
    var camlQuery = new SP.CamlQuery();
	var q = '<View><Query><Where><Eq><FieldRef Name="ID" /><Value Type="Test1">10</Value></Eq></Where></Query></View>';
	camlQuery.set_viewXml(q);
    this.collListItem = oList.getItems(camlQuery);
        
    clientContext.load(collListItem);
        
    clientContext.executeQueryAsync(Function.createDelegate(this, this.onQuerySucceeded), Function.createDelegate(this, this.onQueryFailed));        
        
}

function onQuerySucceeded(sender, args) {

    var listItemInfo = '';

    var listItemEnumerator = collListItem.getEnumerator();
        
    while (listItemEnumerator.moveNext()) {
        var oListItem = listItemEnumerator.get_current();
        listItemInfo += '\nID: ' + oListItem.get_id() + 
            '\nTitle: ' + oListItem.get_item('Title') + 
            '\nBody: ' + oListItem.get_item('Body');
    }

    alert(listItemInfo.toString());
}

function onQueryFailed(sender, args) {

    alert('Request failed. ' + args.get_message() + '\n' + args.get_stackTrace());
}
		</script>
		<br/>
		<div id='listchecking' style='border: 3px solid red;'></div>  
		<script src="https://it1.spt.ford.com/sites/DWSP2016/bin/jquery-3.3.1.min.js"></script>
		<script src="https://it1.spt.ford.com/sites/DWSP2016/bin/list.js"></script>
	</body>
</html>