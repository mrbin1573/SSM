var TableExport = function () {
    "use strict";
    //function to initiate HTML Table Export
    var runTableExportTools = function () {
        $(".export-pdf").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'pdf',
                pdfmake: {enabled: true}
            });
        });
        $(".export-png").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'png'
                // escape: 'false',
                // ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-excel").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'excel',
                escape: 'false',
                excelstyles: ['border-bottom', 'border-top', 'border-left', 'border-right'],
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-xlsx").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'xlsx',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-doc").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'doc',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-powerpoint").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'powerpoint',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-csv").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'csv',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-tsv").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'tsv',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-txt").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'txt',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-xml").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'xml',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-sql").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'sql',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
        $(".export-json").on("click", function (e) {
            e.preventDefault();
            var exportTable = $(this).data("table");
            var filename = $(this).data("filename");
            var ignoreColumn = $(this).data("ignorecolumn");
            $(exportTable).tableExport({
                fileName: filename,
                type: 'json',
                escape: 'false',
                ignoreColumn: '[' + ignoreColumn + ']'
            });
        });
    };
    return {
        init: function () {
            runTableExportTools();
        }
    };
}();
