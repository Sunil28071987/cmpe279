package org.apache.roller.pojos.wrapper;

import org.apache.roller.pojos.WebsiteData;

/**
 * Generated wrapper for class: org.apache.roller.pojos.WebsiteData
 */
public class WebsiteDataWrapper {

    // keep a reference to the wrapped pojo
    private WebsiteData pojo = null;

    // this is private so that we can force the use of the .wrap(pojo) method
    private WebsiteDataWrapper(WebsiteData toWrap) {
        this.pojo = toWrap;
    }

    // wrap the given pojo if it is not null
    public static WebsiteDataWrapper wrap(WebsiteData toWrap) {
        if(toWrap != null)
            return new WebsiteDataWrapper(toWrap);

        return null;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo"
     *
     * This method returns another pojo so we need to wrap the returned pojo.
     */
    public org.apache.roller.pojos.wrapper.TemplateWrapper getPageByName(java.lang.String name)
        throws org.apache.roller.RollerException
    {
        return org.apache.roller.pojos.wrapper.TemplateWrapper.wrap(this.pojo.getPageByName(name));
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo"
     *
     * This method returns another pojo so we need to wrap the returned pojo.
     */
    public org.apache.roller.pojos.wrapper.TemplateWrapper getPageByLink(java.lang.String link)
        throws org.apache.roller.RollerException
    {
        return org.apache.roller.pojos.wrapper.TemplateWrapper.wrap(this.pojo.getPageByLink(link));
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo-collection"
     *
     * This method returns a collection of pojos so we need to wrap
     * each pojo that is part of the collection.
     */
    public java.util.List getPages()
    {
        java.util.List initialCollection = this.pojo.getPages();

        // iterate through and wrap
        // we force the use of an ArrayList because it should be good enough to cover
        // for any Collection type we encounter.
        java.util.ArrayList wrappedCollection = new java.util.ArrayList(initialCollection.size());
        java.util.Iterator it = initialCollection.iterator();
        int i = 0;
        while(it.hasNext()) {
            wrappedCollection.add(i, org.apache.roller.pojos.wrapper.TemplateWrapper.wrap((org.apache.roller.pojos.Template) it.next()));
            i++;
        }

        return wrappedCollection;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getId()
    {   
        return this.pojo.getId();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getHandle()
    {   
        return this.pojo.getHandle();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getName()
    {   
        return this.pojo.getName();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getDescription()
    {   
        return this.pojo.getDescription();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo"
     *
     * This method returns another pojo so we need to wrap the returned pojo.
     */
    public org.apache.roller.pojos.wrapper.UserDataWrapper getCreator()
    {
        return org.apache.roller.pojos.wrapper.UserDataWrapper.wrap(this.pojo.getCreator());
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getDefaultPageId()
    {   
        return this.pojo.getDefaultPageId();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getWeblogDayPageId()
    {   
        return this.pojo.getWeblogDayPageId();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getEnableBloggerApi()
    {   
        return this.pojo.getEnableBloggerApi();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public org.apache.roller.pojos.WeblogCategoryData getBloggerCategory()
    {   
        return this.pojo.getBloggerCategory();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo"
     *
     * This method returns another pojo so we need to wrap the returned pojo.
     */
    public org.apache.roller.pojos.wrapper.WeblogCategoryDataWrapper getDefaultCategory()
    {
        return org.apache.roller.pojos.wrapper.WeblogCategoryDataWrapper.wrap(this.pojo.getDefaultCategory());
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getEditorPage()
    {   
        return this.pojo.getEditorPage();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getBlacklist()
    {   
        return this.pojo.getBlacklist();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getAllowComments()
    {   
        return this.pojo.getAllowComments();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getDefaultAllowComments()
    {   
        return this.pojo.getDefaultAllowComments();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public int getDefaultCommentDays()
    {   
        return this.pojo.getDefaultCommentDays();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getModerateComments()
    {   
        return this.pojo.getModerateComments();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getEmailComments()
    {   
        return this.pojo.getEmailComments();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getEmailFromAddress()
    {   
        return this.pojo.getEmailFromAddress();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getEmailAddress()
    {   
        return this.pojo.getEmailAddress();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getEditorTheme()
    {   
        return this.pojo.getEditorTheme();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getLocale()
    {   
        return this.pojo.getLocale();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getTimeZone()
    {   
        return this.pojo.getTimeZone();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.util.Date getDateCreated()
    {   
        return this.pojo.getDateCreated();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getDefaultPlugins()
    {   
        return this.pojo.getDefaultPlugins();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.util.Locale getLocaleInstance()
    {   
        return this.pojo.getLocaleInstance();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.util.TimeZone getTimeZoneInstance()
    {   
        return this.pojo.getTimeZoneInstance();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public int getEntryDisplayCount()
    {   
        return this.pojo.getEntryDisplayCount();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getEnabled()
    {   
        return this.pojo.getEnabled();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.Boolean getActive()
    {   
        return this.pojo.getActive();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.util.Date getLastModified()
    {   
        return this.pojo.getLastModified();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public boolean isEnableMultiLang()
    {   
        return this.pojo.isEnableMultiLang();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public boolean isShowAllLangs()
    {   
        return this.pojo.isShowAllLangs();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getURL()
    {   
        return this.pojo.getURL();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public java.lang.String getAbsoluteURL()
    {   
        return this.pojo.getAbsoluteURL();
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo-collection"
     *
     * This method returns a collection of pojos so we need to wrap
     * each pojo that is part of the collection.
     */
    public java.util.List getWeblogCategories()
    {
        java.util.List initialCollection = this.pojo.getWeblogCategories();

        // iterate through and wrap
        // we force the use of an ArrayList because it should be good enough to cover
        // for any Collection type we encounter.
        java.util.ArrayList wrappedCollection = new java.util.ArrayList(initialCollection.size());
        java.util.Iterator it = initialCollection.iterator();
        int i = 0;
        while(it.hasNext()) {
            wrappedCollection.add(i, org.apache.roller.pojos.wrapper.WeblogCategoryDataWrapper.wrap((org.apache.roller.pojos.WeblogCategoryData) it.next()));
            i++;
        }

        return wrappedCollection;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo-collection"
     *
     * This method returns a collection of pojos so we need to wrap
     * each pojo that is part of the collection.
     */
    public java.util.List getWeblogCategories(java.lang.String categoryPath)
    {
        java.util.List initialCollection = this.pojo.getWeblogCategories(categoryPath);

        // iterate through and wrap
        // we force the use of an ArrayList because it should be good enough to cover
        // for any Collection type we encounter.
        java.util.ArrayList wrappedCollection = new java.util.ArrayList(initialCollection.size());
        java.util.Iterator it = initialCollection.iterator();
        int i = 0;
        while(it.hasNext()) {
            wrappedCollection.add(i, org.apache.roller.pojos.wrapper.WeblogCategoryDataWrapper.wrap((org.apache.roller.pojos.WeblogCategoryData) it.next()));
            i++;
        }

        return wrappedCollection;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo"
     *
     * This method returns another pojo so we need to wrap the returned pojo.
     */
    public org.apache.roller.pojos.wrapper.WeblogCategoryDataWrapper getWeblogCategory(java.lang.String categoryPath)
    {
        return org.apache.roller.pojos.wrapper.WeblogCategoryDataWrapper.wrap(this.pojo.getWeblogCategory(categoryPath));
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo-collection"
     *
     * This method returns a collection of pojos so we need to wrap
     * each pojo that is part of the collection.
     */
    public java.util.List getRecentWeblogEntries(java.lang.String cat,int length)
    {
        java.util.List initialCollection = this.pojo.getRecentWeblogEntries(cat,length);

        // iterate through and wrap
        // we force the use of an ArrayList because it should be good enough to cover
        // for any Collection type we encounter.
        java.util.ArrayList wrappedCollection = new java.util.ArrayList(initialCollection.size());
        java.util.Iterator it = initialCollection.iterator();
        int i = 0;
        while(it.hasNext()) {
            wrappedCollection.add(i, org.apache.roller.pojos.wrapper.WeblogEntryDataWrapper.wrap((org.apache.roller.pojos.WeblogEntryData) it.next()));
            i++;
        }

        return wrappedCollection;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo-collection"
     *
     * This method returns a collection of pojos so we need to wrap
     * each pojo that is part of the collection.
     */
    public java.util.List getRecentComments(int length)
    {
        java.util.List initialCollection = this.pojo.getRecentComments(length);

        // iterate through and wrap
        // we force the use of an ArrayList because it should be good enough to cover
        // for any Collection type we encounter.
        java.util.ArrayList wrappedCollection = new java.util.ArrayList(initialCollection.size());
        java.util.Iterator it = initialCollection.iterator();
        int i = 0;
        while(it.hasNext()) {
            wrappedCollection.add(i, org.apache.roller.pojos.wrapper.CommentDataWrapper.wrap((org.apache.roller.pojos.CommentData) it.next()));
            i++;
        }

        return wrappedCollection;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo"
     *
     * This method returns another pojo so we need to wrap the returned pojo.
     */
    public org.apache.roller.pojos.wrapper.FolderDataWrapper getBookmarkFolder(java.lang.String folderName)
    {
        return org.apache.roller.pojos.wrapper.FolderDataWrapper.wrap(this.pojo.getBookmarkFolder(folderName));
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="pojo-collection"
     *
     * This method returns a collection of pojos so we need to wrap
     * each pojo that is part of the collection.
     */
    public java.util.List getTodaysReferrers()
    {
        java.util.List initialCollection = this.pojo.getTodaysReferrers();

        // iterate through and wrap
        // we force the use of an ArrayList because it should be good enough to cover
        // for any Collection type we encounter.
        java.util.ArrayList wrappedCollection = new java.util.ArrayList(initialCollection.size());
        java.util.Iterator it = initialCollection.iterator();
        int i = 0;
        while(it.hasNext()) {
            wrappedCollection.add(i, org.apache.roller.pojos.wrapper.RefererDataWrapper.wrap((org.apache.roller.pojos.RefererData) it.next()));
            i++;
        }

        return wrappedCollection;
    }

    /**
     * pojo method tagged with @roller.wrapPojoMethod type="simple"
     *
     * Simply returns the same value that the pojo would have returned.
     */
    public int getTodaysHits()
    {   
        return this.pojo.getTodaysHits();
    }

    /**
     * this is a special method to access the original pojo
     * we don't really want to do this, but it's necessary
     * because some parts of the rendering process still need the
     * orginal pojo object
     */
    public org.apache.roller.pojos.WebsiteData getPojo() {
        return this.pojo;
    }

}
