/*function othername() {
    //var input = document.getElementById("userInput").value;
    alert('Hello , linking works ');
}*/



$('.alert-btn').click (function(){
            alert ('Ramirez come here');
        });

$('#submit-name').click (function(){
            var fNom = $('#fname').val();
            $('#NameText2').text("Hey " + fNom);
            $('#fname').val('');
        });


$('#gen-data').click (function(){
            
         //$('#DataText1').text("Data Loading here");
         /*$.ajax({
                type:"GET",
                url:"https://www.reddit.com/r/Placehlder/search.json?q=hot&restrict_sr=false",
                success: function(data1) {
                    $('#DataText1').html('');

                    for (var i =0 ; i < 2 ;i++)
                    {
                        var displayData = data1.data.children[i].data.url_overridden_by_dest
                        //<p>  <img src="img1.pg" alt="Girl in a jacket"> </p>*/
                       $('#DataText1').append('<p>  Jackets  </p>' )   
                    //}
                    //$('#DataText1').text(JSON.stringify(data1));

                //},
                //dataType: 'jsonp',
                

         //});
});

