package org.apache.roller.ui.authoring.struts.forms;

import org.apache.roller.RollerException;
import java.util.Locale;

/**
 * Generated by XDoclet/ejbdoclet/strutsform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="refererForm"
 */
public class RefererForm
    extends    org.apache.struts.action.ActionForm
    implements java.io.Serializable
{
    protected java.lang.String id;
    protected org.apache.roller.pojos.WebsiteData website;
    protected org.apache.roller.pojos.WeblogEntryData weblogEntry;
    protected java.lang.String dateString;
    protected java.lang.String refererUrl;
    protected java.lang.String refererPermalink;
    protected java.lang.String requestUrl;
    protected java.lang.String title;
    protected java.lang.String excerpt;
    protected java.lang.Boolean visible;
    protected java.lang.Boolean duplicate;
    protected java.lang.Integer dayHits;
    protected java.lang.Integer totalHits;
    protected java.lang.String displayUrl;
    protected java.lang.String url;

    /** Default empty constructor. */
    public RefererForm() {}

    /** Constructor that takes the data object as argument. */
    public RefererForm(org.apache.roller.pojos.RefererData dataHolder, java.util.Locale locale) throws RollerException
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

    public org.apache.roller.pojos.WebsiteData getWebsite()
    {
        return this.website;
    }

   /** 
    */
    public void setWebsite( org.apache.roller.pojos.WebsiteData website )
    {
        this.website = website;
    }

    public org.apache.roller.pojos.WeblogEntryData getWeblogEntry()
    {
        return this.weblogEntry;
    }

   /** 
    */
    public void setWeblogEntry( org.apache.roller.pojos.WeblogEntryData weblogEntry )
    {
        this.weblogEntry = weblogEntry;
    }

    public java.lang.String getDateString()
    {
        return this.dateString;
    }

   /** 
    */
    public void setDateString( java.lang.String dateString )
    {
        this.dateString = dateString;
    }

    public java.lang.String getRefererUrl()
    {
        return this.refererUrl;
    }

   /** 
    */
    public void setRefererUrl( java.lang.String refererUrl )
    {
        this.refererUrl = refererUrl;
    }

    public java.lang.String getRefererPermalink()
    {
        return this.refererPermalink;
    }

   /** 
    */
    public void setRefererPermalink( java.lang.String refererPermalink )
    {
        this.refererPermalink = refererPermalink;
    }

    public java.lang.String getRequestUrl()
    {
        return this.requestUrl;
    }

   /** 
    */
    public void setRequestUrl( java.lang.String requestUrl )
    {
        this.requestUrl = requestUrl;
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

    public java.lang.String getExcerpt()
    {
        return this.excerpt;
    }

   /** 
    */
    public void setExcerpt( java.lang.String excerpt )
    {
        this.excerpt = excerpt;
    }

    public java.lang.Boolean getVisible()
    {
        return this.visible;
    }

   /** 
    */
    public void setVisible( java.lang.Boolean visible )
    {
        this.visible = visible;
    }

    public java.lang.Boolean getDuplicate()
    {
        return this.duplicate;
    }

   /** 
    */
    public void setDuplicate( java.lang.Boolean duplicate )
    {
        this.duplicate = duplicate;
    }

    public java.lang.Integer getDayHits()
    {
        return this.dayHits;
    }

   /** 
    */
    public void setDayHits( java.lang.Integer dayHits )
    {
        this.dayHits = dayHits;
    }

    public java.lang.Integer getTotalHits()
    {
        return this.totalHits;
    }

   /** 
    */
    public void setTotalHits( java.lang.Integer totalHits )
    {
        this.totalHits = totalHits;
    }

    public java.lang.String getDisplayUrl()
    {
        return this.displayUrl;
    }

   /** 
    */
    public void setDisplayUrl( java.lang.String displayUrl )
    {
        this.displayUrl = displayUrl;
    }

    public java.lang.String getUrl()
    {
        return this.url;
    }

   /** 
    */
    public void setUrl( java.lang.String url )
    {
        this.url = url;
    }

    /**
     * Copy values from this form bean to the specified data object.
     * Only copies primitive types (Boolean, boolean, String, Integer, int, Timestamp, Date)
     */
    public void copyTo(org.apache.roller.pojos.RefererData dataHolder, Locale locale) throws RollerException
    {

        dataHolder.setId(this.id);

        dataHolder.setDateString(this.dateString);

        dataHolder.setRefererUrl(this.refererUrl);

        dataHolder.setRefererPermalink(this.refererPermalink);

        dataHolder.setRequestUrl(this.requestUrl);

        dataHolder.setTitle(this.title);

        dataHolder.setExcerpt(this.excerpt);

        dataHolder.setVisible(this.visible);

        dataHolder.setDuplicate(this.duplicate);

        dataHolder.setDayHits(this.dayHits);

        dataHolder.setTotalHits(this.totalHits);

        dataHolder.setDisplayUrl(this.displayUrl);

        dataHolder.setUrl(this.url);

    }

    /**
     * Copy values from specified data object to this form bean.
     * Includes all types.
     */
    public void copyFrom(org.apache.roller.pojos.RefererData dataHolder, Locale locale) throws RollerException
    {

        this.id = dataHolder.getId();

        this.dateString = dataHolder.getDateString();

        this.refererUrl = dataHolder.getRefererUrl();

        this.refererPermalink = dataHolder.getRefererPermalink();

        this.requestUrl = dataHolder.getRequestUrl();

        this.title = dataHolder.getTitle();

        this.excerpt = dataHolder.getExcerpt();

        this.visible = dataHolder.getVisible();

        this.duplicate = dataHolder.getDuplicate();

        this.dayHits = dataHolder.getDayHits();

        this.totalHits = dataHolder.getTotalHits();

        this.displayUrl = dataHolder.getDisplayUrl();

        this.url = dataHolder.getUrl();

    }

    public void doReset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.ServletRequest request)
    {

        this.id = null;

        this.dateString = null;

        this.refererUrl = null;

        this.refererPermalink = null;

        this.requestUrl = null;

        this.title = null;

        this.excerpt = null;

        this.visible = null;

        this.duplicate = null;

        this.dayHits = null;

        this.totalHits = null;

        this.displayUrl = null;

        this.url = null;

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
