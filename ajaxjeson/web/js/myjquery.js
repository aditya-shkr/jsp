$('#a1').click(function(){
	
	if(this.checked)
	{
		$('.a').each(function()
		{
			this.checked = true;
		});
	}
	else
	{
		$('.a').each(function()
		{
			this.checked = false;
		});
	}
});