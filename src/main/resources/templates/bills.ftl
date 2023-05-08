<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Bills</title>
</head>
<body background="аптвапттаптаптаптаптапт.jpg">
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>Client</th>
            <th>SellingList</th>
            <th>ProductList</th>
            <th>Discount</th>
            <th>TotalSum</th>
        </tr>
        <#list bills as bill>
            <tr>
                <td>${bill.client}</td>
                <td><#list bill.sellingList as item>
                    ${item}
                    </#list></td>
                <td><#list bill.productList as item>
                        ${item}
                    </#list></td>
                <td>${bill.discount}</td>
                <td>${bill.totalSum}</td>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>