/**
 * 
 */
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

function onQuerySucceeded(sender, args) 
{

    var listItemInfo = '';

    var listItemEnumerator = collListItem.getEnumerator();
        
    while (listItemEnumerator.moveNext()) 
    {
        var oListItem = listItemEnumerator.get_current();
        listItemInfo += '\nID: ' + oListItem.get_id() + 
            '\nTitle: ' + oListItem.get_item('Title') + 
            '\nBody: ' + oListItem.get_item('Body');
    }

    alert(listItemInfo.toString());
}

function onQueryFailed(sender, args) 
{

    alert('Request failed. ' + args.get_message() + '\n' + args.get_stackTrace());
}