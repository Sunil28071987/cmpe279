package org.apache.roller.ui.authoring.struts.forms;

import org.apache.roller.RollerException;
import java.util.Locale;

/**
 * Generated by XDoclet/ejbdoclet/strutsform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="permissionsForm"
 */
public class PermissionsForm
    extends    org.apache.struts.action.ActionForm
    implements java.io.Serializable
{
    protected java.lang.String id;
    protected org.apache.roller.pojos.WebsiteData website;
    protected org.apache.roller.pojos.UserData user;
    protected short permissionMask;
    protected boolean pending;

    /** Default empty constructor. */
    public PermissionsForm() {}

    /** Constructor that takes the data object as argument. */
    public PermissionsForm(org.apache.roller.pojos.PermissionsData dataHolder, java.util.Locale locale) throws RollerException
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

    public org.apache.roller.pojos.UserData getUser()
    {
        return this.user;
    }

   /** 
    */
    public void setUser( org.apache.roller.pojos.UserData user )
    {
        this.user = user;
    }

    public short getPermissionMask()
    {
        return this.permissionMask;
    }

   /** 
    */
    public void setPermissionMask( short permissionMask )
    {
        this.permissionMask = permissionMask;
    }

    public boolean isPending()
    {
        return this.pending;
    }

   /** 
    */
    public void setPending( boolean pending )
    {
        this.pending = pending;
    }

    /**
     * Copy values from this form bean to the specified data object.
     * Only copies primitive types (Boolean, boolean, String, Integer, int, Timestamp, Date)
     */
    public void copyTo(org.apache.roller.pojos.PermissionsData dataHolder, Locale locale) throws RollerException
    {

        dataHolder.setId(this.id);

        dataHolder.setPending(this.pending);

    }

    /**
     * Copy values from specified data object to this form bean.
     * Includes all types.
     */
    public void copyFrom(org.apache.roller.pojos.PermissionsData dataHolder, Locale locale) throws RollerException
    {

        this.id = dataHolder.getId();

        this.pending = dataHolder.isPending();

    }

    public void doReset(
    	org.apache.struts.action.ActionMapping mapping, 
    	javax.servlet.ServletRequest request)
    {

        this.id = null;

        this.pending = false;

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
