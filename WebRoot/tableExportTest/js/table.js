
//为导出功能设置数据源
function setExportDataAttr() {
    $(".export-csv").attr("data-table",".menu_third_page");
    $(".export-tsv").attr("data-table",".menu_third_page");
    $(".export-pdf").attr("data-table","#energy_day");
    $(".export-png").attr("data-table","");
    $(".export-excel").attr("data-table",".menu_third_page");
    $(".export-xlsx").attr("data-table",".menu_third_page");
    $(".export-doc").attr("data-table",".menu_third_page");
    $(".export-powerpoint").attr("data-table",".menu_third_page");
    $(".export-txt").attr("data-table",".menu_third_page");
    $(".export-xml").attr("data-table",".menu_third_page");
    $(".export-sql").attr("data-table",".menu_third_page");
    $(".export-json").attr("data-table",".menu_third_page");

    $(".export-csv").attr("data-filename","能耗检测");
    $(".export-tsv").attr("data-filename","能耗检测");
    $(".export-pdf").attr("data-filename","能耗检测");
    $(".export-png").attr("data-filename","能耗检测");
    $(".export-excel").attr("data-filename","能耗检测");
    $(".export-xlsx").attr("data-filename","能耗检测");
    $(".export-doc").attr("data-filename","能耗检测");
    $(".export-powerpoint").attr("data-filename","能耗检测");
    $(".export-txt").attr("data-filename","能耗检测");
    $(".export-xml").attr("data-filename","能耗检测");
    $(".export-sql").attr("data-filename","能耗检测");
    $(".export-json").attr("data-filename","能耗检测");
};

setExportDataAttr();
setExportDataAttr();
setExportDataAttr();
setExportDataAttr();
setExportDataAttr();
setExportDataAttr();
setExportDataAttr();