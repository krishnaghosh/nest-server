/**
 * 
 */
package com.srans.nestserver.util;

/**
 * @author user
 *
 */
public class MailTemplates {
	
	public static final String TENANT_REGISTRATION_TEMPLATE = "<html><body style='margin: 0; padding: 0;'><table align='center' border='0' cellpadding='0' cellspacing='0' width='100%' style='border-collapse: collapse;'>\r\n" + 
			"     <tr>  <td  align='left'  bgcolor='#f5f5f5'  style='padding: 20px 0px 15px 50px;'> Dear \r\n ##USER_NAME## "  + 
			"     </td> </tr>\r\n" + 
			"    <tr>  <td align='left' bgcolor='#f5f5f5' style= ' text-align: justify; padding: 5px 0px 5px 20px '> you are successfully registered.\r\n" + 
			"     Your new Nidos account has been created. Welcome to the NIDOS community.<br>\r\n" + 
			"     Please logon to your account using your username and temporary password.\r\n" + 
			"     \r\n" + 
			"       </td> </tr>\r\n" + 
			"     <tr>  <td> \r\n" + 
			"    <table cellpadding='0' cellspacing='0'  width='75%'>\r\n" + 
			"     <tr><td align='center' bgcolor='#f5f5f5' style='padding: 20px 0 15px 0'> Username :</td><td align='center' bgcolor='#f5f5f5' style='padding: 20px 0 15px 0'> ##USER_NAME##</td></tr>\r\n" + 
			"     <tr><td align='center' bgcolor='#ffffff' style='padding: 20px 0 15px 0'> Password :</td><td align='center' bgcolor='#ffffff' style='padding: 20px 0 15px 0'>##PASSWORD##</td></tr>\r\n" + 
			"     <tr><td align='center' bgcolor='#f5f5f5' style='padding: 20px 0 15px 0'> Hostel Name :</td><td align='center' bgcolor='#f5f5f5' style='padding: 20px 0 15px 0'>##HOSTEL_NAME##</td></tr>\r\n" + 
			"     <tr><td align='center' bgcolor='#ffffff' style='padding: 20px 0 15px 0'>  Room Number :</td><td align='center' bgcolor='#ffffff' style='padding: 20px 0 15px 0'>##ROOM_NUMBER##</td></tr>\r\n" + 
			"     <tr><td align='center' bgcolor='#f5f5f5' style='padding: 20px 0 15px 0'>  Floor Number :</td><td align='center' bgcolor='#f5f5f5' style='padding: 20px 0 15px 0'>##FLOOR_NUMBER##</td></tr>\r\n" + 
			"    <tr><td align='center' bgcolor='#ffffff' style='padding: 20px 0 15px 0'>  Room Rent  :</td><td align='center' bgcolor='#ffffff' style='padding: 20px 0 15px 0'> ##ROOM_RENT##</td></tr>\r\n" + 
			"    </table>\r\n" + 
			"      </td> </tr>\r\n" + 
			"    <tr><td align='left'  bgcolor='#f5f5f5'  style='padding: 20px 0px 15px 50px;'>This is an autogenerated emial, please dont reply to this thread.<br>Thank You<br><br>--Regards<br>NIODS Community<br>Hyderabad</td></tr> \r\n" + 
			"    </table>\r\n" + 
			"     </body></html>";
	
	public static final String TENANT_INVOICE_TEMPLATE= "<!doctype html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"    <meta charset=\"utf-8\">\r\n" + 
			"    <title>Invoice Template</title>\r\n" + 
			"    \r\n" + 
			"    <style>\r\n" + 
			"    .invoice-box {\r\n" + 
			"        max-width: 800px;\r\n" + 
			"        margin: auto;\r\n" + 
			"        padding: 30px;\r\n" + 
			"        border: 1px solid #eee;\r\n" + 
			"        box-shadow: 0 0 10px rgba(0, 0, 0, .15);\r\n" + 
			"        font-size: 16px;\r\n" + 
			"        line-height: 24px;\r\n" + 
			"        font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;\r\n" + 
			"        color: #555;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table {\r\n" + 
			"        width: 100%;\r\n" + 
			"        line-height: inherit;\r\n" + 
			"        text-align: left;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table td {\r\n" + 
			"        padding: 5px;\r\n" + 
			"        vertical-align: top;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr td:nth-child(2) {\r\n" + 
			"        text-align: right;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.top table td {\r\n" + 
			"        padding-bottom: 20px;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.top table td.title {\r\n" + 
			"        font-size: 45px;\r\n" + 
			"        line-height: 45px;\r\n" + 
			"        color: #333;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.information table td {\r\n" + 
			"        padding-bottom: 40px;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.heading td {\r\n" + 
			"        background: #eee;\r\n" + 
			"        border-bottom: 1px solid #ddd;\r\n" + 
			"        font-weight: bold;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.details td {\r\n" + 
			"        padding-bottom: 20px;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.item td{\r\n" + 
			"        border-bottom: 1px solid #eee;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.item.last td {\r\n" + 
			"        border-bottom: none;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .invoice-box table tr.total td:nth-child(2) {\r\n" + 
			"        border-top: 2px solid #eee;\r\n" + 
			"        font-weight: bold;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    @media only screen and (max-width: 600px) {\r\n" + 
			"        .invoice-box table tr.top table td {\r\n" + 
			"            width: 100%;\r\n" + 
			"            display: block;\r\n" + 
			"            text-align: center;\r\n" + 
			"        }\r\n" + 
			"        \r\n" + 
			"        .invoice-box table tr.information table td {\r\n" + 
			"            width: 100%;\r\n" + 
			"            display: block;\r\n" + 
			"            text-align: center;\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    /** RTL **/\r\n" + 
			"    .rtl {\r\n" + 
			"        direction: rtl;\r\n" + 
			"        font-family: Tahoma, 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .rtl table {\r\n" + 
			"        text-align: right;\r\n" + 
			"    }\r\n" + 
			"    \r\n" + 
			"    .rtl table tr td:nth-child(2) {\r\n" + 
			"        text-align: left;\r\n" + 
			"    }\r\n" + 
			"    </style>\r\n" + 
			"</head>\r\n" + 
			"\r\n" + 
			"<body>\r\n" + 
			"    <div class=\"invoice-box\">\r\n" + 
			"        <table cellpadding=\"0\" cellspacing=\"0\">\r\n" + 
			"            <tr class=\"top\">\r\n" + 
			"                <td colspan=\"2\">\r\n" + 
			"                    <table>\r\n" + 
			"                        <tr>\r\n" + 
			"                            <td class=\"title\">\r\n" + 
			"                                <img src=\"#\" style=\"width:100%; max-width:300px;\">\r\n" + 
			"                            </td>\r\n" + 
			"                            \r\n" + 
			"                            <td>\r\n" + 
			"                                Invoice No. : 123<br>\r\n" + 
			"                                Created: January 1, 2015<br>\r\n" + 
			"                            \r\n" + 
			"                            </td>\r\n" + 
			"                        </tr>\r\n" + 
			"                    </table>\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"            \r\n" + 
			"            <tr class=\"information\">\r\n" + 
			"                <td colspan=\"2\">\r\n" + 
			"                    <table>\r\n" + 
			"                        <tr>\r\n" + 
			"                            <td>\r\n" + 
			"                                Nidos, Inc.<br>\r\n" + 
			"                                12345 Sunny Road<br>\r\n" + 
			"                                Hyderabad, CA 12345\r\n" + 
			"                            </td>\r\n" + 
			"                            \r\n" + 
			"                            <td>\r\n" + 
			"                                Srans Corp.<br>\r\n" + 
			"                                Nest<br>\r\n" + 
			"                                Srans@example.in\r\n" + 
			"                            </td>\r\n" + 
			"                        </tr>\r\n" + 
			"                    </table>\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"            \r\n" + 
			"            <tr class=\"heading\">\r\n" + 
			"                <td>\r\n" + 
			"                    Payment Method\r\n" + 
			"                </td>\r\n" + 
			"                \r\n" + 
			"                <td>\r\n" + 
			"                    Check #\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"            \r\n" + 
			"            <tr class=\"details\">\r\n" + 
			"                <td>\r\n" + 
			"                    Check\r\n" + 
			"                </td>\r\n" + 
			"                \r\n" + 
			"                <td>\r\n" + 
			"                    1000\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"            \r\n" + 
			"            <tr class=\"heading\">\r\n" + 
			"                <td>\r\n" + 
			"                    Invoice Item\r\n" + 
			"                </td>\r\n" + 
			"                \r\n" + 
			"                <td>\r\n" + 
			"                    Amount\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"            \r\n" + 
			"            <tr class=\"item\">\r\n" + 
			"                <td>\r\n" + 
			"                    Monthly Rent\r\n" + 
			"                </td>\r\n" + 
			"                \r\n" + 
			"                <td>\r\n" + 
			"                    Rs. 5000.00\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"            \r\n" + 
			"            <tr class=\"total\">\r\n" + 
			"                <td></td>\r\n" + 
			"                \r\n" + 
			"                <td>\r\n" + 
			"                   Total: 5000.00\r\n" + 
			"                </td>\r\n" + 
			"            </tr>\r\n" + 
			"        </table>\r\n" + 
			"    </div>\r\n" + 
			"</body>\r\n" + 
			"</html>";

}
