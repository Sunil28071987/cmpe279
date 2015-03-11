package org.apache.roller.ui.authoring.struts.forms;

import org.apache.roller.RollerException;
import java.util.Locale;

/**
 * Generated by XDoclet/ejbdoclet/strutsform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="planetConfigForm"
 */
public class PlanetConfigForm
    extends    org.apache.struts.action.ActionForm
    implements java.io.Serializable
{
    protected java.lang.String id;
    protected org.apache.roller.pojos.PlanetGroupData defaultGroup;
    protected java.lang.String groupPage;
    protected java.lang.String mainPage;
    protected java.lang.String proxyHost;
    protected int proxyPort;
    protected java.lang.String siteURL;
    protected java.lang.String adminEmail;
    protected java.lang.String adminName;
    protected java.lang.String outputDir;
    protected java.lang.String templateDir;
    protected java.lang.String description;
    protected java.lang.String title;
    protected java.lang.String cacheDir;

    /** Default empty constructor. */
    public PlanetConfigForm() {}

    /** Constructor that takes the data object as argument. */
    public PlanetConfigForm(org.apache.roller.pojos.PlanetConfigData dataHolder, java.util.Locale locale) throws RollerException
    {
       copyFrom(dataHolder, locale);
    }

    public java.lang.String getId()
    {
        return this.id;
    }

   /** 
    */
    public void setId( java.lang.String id )
    {
        this.id = id;
    }

    public org.apache.roller.pojos.PlanetGroupData getDefaultGroup()
    {
        return this.defaultGroup;
    }

   /** 
    */
    public void setDefaultGroup( org.apache.roller.pojos.PlanetGroupData defaultGroup )
    {
        this.defaultGroup = defaultGroup;
    }

    public java.lang.String getGroupPage()
    {
        return this.groupPage;
    }

   /** 
    */
    public void setGroupPage( java.lang.String groupPage )
    {
        this.groupPage = groupPage;
    }

    public java.lang.String getMainPage()
    {
        return this.mainPage;
    }

   /** 
    */
    public void setMainPage( java.lang.String mainPage )
    {
        this.mainPage = mainPage;
    }

    public java.lang.String getProxyHost()
    {
        return this.proxyHost;
    }

   /** 
    */
    public void setProxyHost( java.lang.String proxyHost )
    {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort()
    {
        return this.proxyPort;
    }

   /** 
    */
    public void setProxyPort( int proxyPort )
    {
        this.proxyPort = proxyPort;
    }

    public java.lang.String getSiteURL()
    {
        return this.siteURL;
    }

   /** 
    */
    public void setSiteURL( java.lang.String siteURL )
    {
        this.siteURL = siteURL;
    }

    public java.lang.String getAdminEmail()
    {
        return this.adminEmail;
    }

   /** 
    */
    public void setAdminEmail( java.lang.String adminEmail )
    {
        this.adminEmail = adminEmail;
    }

    public java.lang.String getAdminName()
    {
        return this.adminName;
    }

   /** 
    */
    public void setAdminName( java.lang.String adminName )
    {
        this.adminName = adminName;
    }

    public java.lang.String getOutputDir()
    {
        return this.outputDir;
    }

   /** 
    */
    public void setOutputDir( java.lang.String outputDir )
    {
        this.outputDir = outputDir;
    }

    public java.lang.String getTemplateDir()
    {
        return this.templateDir;
    }

   /** 
    */
    public void setTemplateDir( java.lang.String templateDir )
    {
        this.templateDir = templateDir;
    }

    public java.lang.String getDescription()
    {
        return this.description;
    }

   /** 
    */
    public void setDescription( java.lang.String description )
    {
        this.description = description;
    }

    public java.lang.String getTitle()
    {
        return this.title;
    }

   /** 
    */
    public void setTitle( java.lang.String title )
    {
        this.title = title;
    }

    public java.lang.String getCacheDir()
    {
        return this.cacheDir;
    }

   /** 
    */
    public void setCacheDir( java.lang.String cacheDir )
    {
        this.cacheDir = cacheDir;
    }

    /**
     * Copy values from this form bean to the specified data object.
     * Only copies primitive types (Boolean, boolean, String, Integer, int, Timestamp, Date)
     */
    public void copyTo(org.apache.roller.pojos.PlanetConfigData dataHolder, Locale locale) throws RollerException
    {

        dataHolder.setId(this.id);

        dataHolder.setGroupPage(this.groupPage);

        dataHolder.setMainPage(this.mainPage);

        dataHolder.setProxyHost(this.proxyHost);

        dataHolder.setProxyPort(this.proxyPort);

        dataHolder.setSiteURL(this.siteURL);

        dataHolder.setAdminEmail(this.adminEmail);

        dataHolder.setAdminName(this.adminName);

        dataHolder.setOutputDir(this.outputDir);

        dataHolder.setTemplateDir(this.templateDir);

        dataHolder.setDescription(this.description);

        dataHolder.setTitle(this.title);

        dataHolder.setCacheDir(this.cacheDir);

    }

    /**
     * Copy values from specified data object to this form bean.
     * Includes all types.
     */
    public void copyFrom(org.apache.roller.pojos.PlanetConfigData dataHolder, Locale locale) throws RollerException
    {

        this.id = dataHolder.getId();

        this.groupPage = dataHolder.getGroupPage();

        this.mainPage = dataHolder.getMainPage();

        this.proxyHost = dataHolder.getProxyHost();

        this.proxyPort = dataHolder.getProxyPort();

        this.siteURL = dataHolder.getSiteURL();

        this.adminEmail = dataHolder.getAdminEmail();

        this.adminName = dataHolder.getAdminName();

        this.outputDir = dataHolder.getOutputDir();

        this.templateDir = dataHolder.getTemplateDir();

        this.description = dataHolder.getDescription();

        this.title = dataHolder.getTitle();

        this.cacheDir = dataHolder.getCacheDir();

    }

    public void doReset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.ServletRequest request)
    {

        this.id = null;

        this.groupPage = null;

        this.mainPage = null;

        this.proxyHost = null;

        this.proxyPort = 0;

        this.siteURL = null;

        this.adminEmail = null;

        this.adminName = null;

        this.outputDir = null;

        this.templateDir = null;

        this.description = null;

        this.title = null;

        this.cacheDir = null;

    }
    public void reset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.ServletRequest request)
    {
        doReset(mapping, request);
    }
    public void reset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.http.HttpServletRequest request)
    {
        doReset(mapping, request);
    }
}
