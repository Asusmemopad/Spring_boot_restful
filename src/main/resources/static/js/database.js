$(document).ready( function () {
    var table = $('#employeesTable').DataTable({
        "sAjaxSource": "/api/user/",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "name" },
            { "mData": "age" },
            { "mData": "salary" }
        ]
    })
});