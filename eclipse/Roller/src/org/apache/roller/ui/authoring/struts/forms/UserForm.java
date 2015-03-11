package org.apache.roller.ui.authoring.struts.forms;

import org.apache.roller.RollerException;
import java.util.Locale;

/**
 * Generated by XDoclet/ejbdoclet/strutsform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="userForm"
 */
public class UserForm
    extends    org.apache.struts.action.ActionForm
    implements java.io.Serializable
{
    protected java.util.List permissions;
    protected java.lang.Boolean enabled;
    protected java.lang.String id;
    protected java.lang.String userName;
    protected java.lang.String password;
    protected java.lang.String fullName;
    protected java.lang.String emailAddress;
    protected java.util.Date dateCreated;
    protected java.lang.String locale;
    protected java.lang.String timeZone;
    protected java.util.Set roles;

    /** Default empty constructor. */
    public UserForm() {}

    /** Constructor that takes the data object as argument. */
    public UserForm(org.apache.roller.pojos.UserData dataHolder, java.util.Locale locale) throws RollerException
    {
       copyFrom(dataHolder, locale);
    }

    public java.util.List getPermissions()
    {
        return this.permissions;
    }

   /** 
    */
    public void setPermissions( java.util.List permissions )
    {
        this.permissions = permissions;
    }

    public java.lang.Boolean getEnabled()
    {
        return this.enabled;
    }

   /** 
    */
    public void setEnabled( java.lang.Boolean enabled )
    {
        this.enabled = enabled;
    }

    public java.lang.String getId()
    {
        return this.id;
    }

   /** 
    * @struts.validator type="required" msgkey="errors.required"
    */
    public void setId( java.lang.String id )
    {
        this.id = id;
    }

    public java.lang.String getUserName()
    {
        return this.userName;
    }

   /** 
    */
    public void setUserName( java.lang.String userName )
    {
        this.userName = userName;
    }

    public java.lang.String getPassword()
    {
        return this.password;
    }

   /** 
    */
    public void setPassword( java.lang.String password )
    {
        this.password = password;
    }

    public java.lang.String getFullName()
    {
        return this.fullName;
    }

   /** 
    */
    public void setFullName( java.lang.String fullName )
    {
        this.fullName = fullName;
    }

    public java.lang.String getEmailAddress()
    {
        return this.emailAddress;
    }

   /** 
    */
    public void setEmailAddress( java.lang.String emailAddress )
    {
        this.emailAddress = emailAddress;
    }

    public java.util.Date getDateCreated()
    {
        return this.dateCreated;
    }

   /** 
    */
    public void setDateCreated( java.util.Date dateCreated )
    {
        this.dateCreated = dateCreated;
    }

    public java.lang.String getLocale()
    {
        return this.locale;
    }

   /** 
    */
    public void setLocale( java.lang.String locale )
    {
        this.locale = locale;
    }

    public java.lang.String getTimeZone()
    {
        return this.timeZone;
    }

   /** 
    */
    public void setTimeZone( java.lang.String timeZone )
    {
        this.timeZone = timeZone;
    }

    public java.util.Set getRoles()
    {
        return this.roles;
    }

   /** 
    */
    public void setRoles( java.util.Set roles )
    {
        this.roles = roles;
    }

    /**
     * Copy values from this form bean to the specified data object.
     * Only copies primitive types (Boolean, boolean, String, Integer, int, Timestamp, Date)
     */
    public void copyTo(org.apache.roller.pojos.UserData dataHolder, Locale locale) throws RollerException
    {

        dataHolder.setEnabled(this.enabled);

        dataHolder.setId(this.id);

        dataHolder.setUserName(this.userName);

        dataHolder.setPassword(this.password);

        dataHolder.setFullName(this.fullName);

        dataHolder.setEmailAddress(this.emailAddress);

        dataHolder.setDateCreated(this.dateCreated);

        dataHolder.setLocale(this.locale);

        dataHolder.setTimeZone(this.timeZone);

    }

    /**
     * Copy values from specified data object to this form bean.
     * Includes all types.
     */
    public void copyFrom(org.apache.roller.pojos.UserData dataHolder, Locale locale) throws RollerException
    {

        this.enabled = dataHolder.getEnabled();

        this.id = dataHolder.getId();

        this.userName = dataHolder.getUserName();

        this.password = dataHolder.getPassword();

        this.fullName = dataHolder.getFullName();

        this.emailAddress = dataHolder.getEmailAddress();

        this.dateCreated = dataHolder.getDateCreated();

        this.locale = dataHolder.getLocale();

        this.timeZone = dataHolder.getTimeZone();

    }

    public void doReset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.ServletRequest request)
    {

        this.enabled = null;

        this.id = null;

        this.userName = null;

        this.password = null;

        this.fullName = null;

        this.emailAddress = null;

        this.dateCreated = null;

        this.locale = null;

        this.timeZone = null;

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
