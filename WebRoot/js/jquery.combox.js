(function($){
		$.fn.combox = function(options) {
			var defaults = {  
                borderCss: "combox_border",  
                inputCss: "combox_input",  
                buttonCss: "combox_button",  
                selectCss: "combox_select",
				datas:[]
            };
            var options = $.extend(defaults, options);
			
			function _initBorder($border) {//初始化外框CSS
				$border.css({'display':'inline-block', 'position':'relative'}).addClass(options.borderCss);
				return $border;
			}
			
			function _initInput($border){//初始化输入框
				$border.append('<input type="text" class="'+options.inputCss+'"/>');
				$border.append('<font class="ficomoon icon-angle-bottom '+options.buttonCss+'" style="display:inline-block"></font>');
				//绑定下拉特效
				$border.delegate('font', 'click', function() {
					var $ul = $border.children('ul');
					if($ul.css('display') == 'none') {
						$ul.slideDown('fast');
						$(this).removeClass('icon-angle-bottom').addClass('icon-angle-top');
					}else {
						$ul.slideUp('fast');
						$(this).removeClass('icon-angle-top').addClass('icon-angle-bottom');
					}					
				});
				return $border;//IE6需要返回值
			}
			
			function _initSelect($border) {//初始化下拉列表
				$border.append('<ul style="position:absolute;left:-1px;display:none" class="'+options.selectCss+'">');
				var $ul = $border.children('ul');
				$ul.css('top',$border.height()+1);
				var length = options.datas.length;
				for(var i=0; i<length ;i++)
					$ul.append('<li><a href="javascript:void(0)">'+options.datas[i]+'</a></li>');
				$ul.delegate('li', 'click', function() {
					$border.children(':text').val($(this).text());
					$ul.hide();
					$border.children('font').removeClass('icon-angle-top').addClass('icon-angle-bottom');//确定的时候要将下拉的icon改变
				});
				return $border;
			}
			this.each(function() {
				var _this = $(this);
				_this = _initBorder(_this);//初始化外框CSS
				_this = _initInput(_this);//初始化输入框
				_initSelect(_this);//初始化下拉列表
			});
		};
})(jQuery);