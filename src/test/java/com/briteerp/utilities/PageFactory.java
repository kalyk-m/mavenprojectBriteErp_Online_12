package com.briteerp.utilities;

import com.briteerp.pages.*;

public class PageFactory {
    private LoginPage loginPage;
    private InvoicingPage invoicingPage;
    private CatalogPage catalogPage;
    private OrdersPage ordersPage;
    private ConfigurationPage configurationPage;
    private ReportingPage reportingPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public InvoicingPage getInvoicingPage() {
        if (invoicingPage == null) {
            invoicingPage = new InvoicingPage();
        }
        return invoicingPage;
    }

    public CatalogPage getCatalogPage() {
        if (catalogPage == null) {
            catalogPage = new CatalogPage();
        }
        return catalogPage;
    }

    public OrdersPage getOrdersPage() {
        if (ordersPage == null) {
            ordersPage = new OrdersPage();
        }
        return ordersPage;
    }

    public ConfigurationPage getConfigurationPage() {
        if (configurationPage == null) {
            configurationPage = new ConfigurationPage();
        }
        return configurationPage;
    }

    public ReportingPage getReportingPage () {
        if (reportingPage == null) {
            reportingPage = new ReportingPage();
        }
        return reportingPage;
    }
}
