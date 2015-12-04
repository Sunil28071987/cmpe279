package org.apache.roller.ui.authoring.struts.forms;

import org.apache.roller.RollerException;
import java.util.Locale;

/**
 * Generated by XDoclet/ejbdoclet/strutsform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="commentForm"
 */
public class CommentForm
    extends    org.apache.struts.action.ActionForm
    implements java.io.Serializable
{
    protected java.lang.String id;
    protected org.apache.roller.pojos.WeblogEntryData weblogEntry;
    protected java.lang.String name;
    protected java.lang.String email;
    protected java.lang.String url;
    protected java.lang.String content;
    protected java.sql.Timestamp postTime;
    protected java.lang.Boolean spam;
    protected java.lang.Boolean notify;
    protected java.lang.Boolean pending;
    protected java.lang.Boolean approved;
    protected java.lang.String remoteHost;
    protected java.lang.String timestamp;

    /** Default empty constructor. */
    public CommentForm() {}

    /** Constructor that takes the data object as argument. */
    public CommentForm(org.apache.roller.pojos.CommentData dataHolder, java.util.Locale locale) throws RollerException
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

    public java.lang.String getName()
    {
        return this.name;
    }

   /** 
    */
    public void setName( java.lang.String name )
    {
        this.name = name;
    }

    public java.lang.String getEmail()
    {
        return this.email;
    }

   /** 
    */
    public void setEmail( java.lang.String email )
    {
        this.email = email;
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

    public java.lang.String getContent()
    {
        return this.content;
    }

   /** 
    */
    public void setContent( java.lang.String content )
    {
        this.content = content;
    }

    public java.sql.Timestamp getPostTime()
    {
        return this.postTime;
    }

   /** 
    */
    public void setPostTime( java.sql.Timestamp postTime )
    {
        this.postTime = postTime;
    }

    public java.lang.Boolean getSpam()
    {
        return this.spam;
    }

   /** 
    */
    public void setSpam( java.lang.Boolean spam )
    {
        this.spam = spam;
    }

    public java.lang.Boolean getNotify()
    {
        return this.notify;
    }

   /** 
    */
    public void setNotify( java.lang.Boolean notify )
    {
        this.notify = notify;
    }

    public java.lang.Boolean getPending()
    {
        return this.pending;
    }

   /** 
    */
    public void setPending( java.lang.Boolean pending )
    {
        this.pending = pending;
    }

    public java.lang.Boolean getApproved()
    {
        return this.approved;
    }

   /** 
    */
    public void setApproved( java.lang.Boolean approved )
    {
        this.approved = approved;
    }

    public java.lang.String getRemoteHost()
    {
        return this.remoteHost;
    }

   /** 
    */
    public void setRemoteHost( java.lang.String remoteHost )
    {
        this.remoteHost = remoteHost;
    }

    public java.lang.String getTimestamp()
    {
        return this.timestamp;
    }

   /** 
    */
    public void setTimestamp( java.lang.String timestamp )
    {
        this.timestamp = timestamp;
    }

    /**
     * Copy values from this form bean to the specified data object.
     * Only copies primitive types (Boolean, boolean, String, Integer, int, Timestamp, Date)
     */
    public void copyTo(org.apache.roller.pojos.CommentData dataHolder, Locale locale) throws RollerException
    {

        dataHolder.setId(this.id);

        dataHolder.setName(this.name);

        dataHolder.setEmail(this.email);

        dataHolder.setUrl(this.url);

        dataHolder.setContent(this.content);

        dataHolder.setPostTime(this.postTime);

        dataHolder.setSpam(this.spam);

        dataHolder.setNotify(this.notify);

        dataHolder.setPending(this.pending);

        dataHolder.setApproved(this.approved);

        dataHolder.setRemoteHost(this.remoteHost);

        dataHolder.setTimestamp(this.timestamp);

    }

    /**
     * Copy values from specified data object to this form bean.
     * Includes all types.
     */
    public void copyFrom(org.apache.roller.pojos.CommentData dataHolder, Locale locale) throws RollerException
    {

        this.id = dataHolder.getId();

        this.name = dataHolder.getName();

        this.email = dataHolder.getEmail();

        this.url = dataHolder.getUrl();

        this.content = dataHolder.getContent();

        this.postTime = dataHolder.getPostTime();

        this.spam = dataHolder.getSpam();

        this.notify = dataHolder.getNotify();

        this.pending = dataHolder.getPending();

        this.approved = dataHolder.getApproved();

        this.remoteHost = dataHolder.getRemoteHost();

        this.timestamp = dataHolder.getTimestamp();

    }

    public void doReset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.ServletRequest request)
    {

        this.id = null;

        this.name = null;

        this.email = null;

        this.url = null;

        this.content = null;

        this.postTime = null;

        this.spam = null;

        this.notify = null;

        this.pending = null;

        this.approved = null;

        this.remoteHost = null;

        this.timestamp = null;

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