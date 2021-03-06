/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentFavorite;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.FavoriteType;
import java.util.List;

class ApplicationInsightsComponentFavoriteImpl extends CreatableUpdatableImpl<ApplicationInsightsComponentFavorite, ApplicationInsightsComponentFavoriteInner, ApplicationInsightsComponentFavoriteImpl> implements ApplicationInsightsComponentFavorite, ApplicationInsightsComponentFavorite.Definition {
    private final InsightsManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String favoriteId;

    ApplicationInsightsComponentFavoriteImpl(String name, InsightsManager manager) {
        super(name, new ApplicationInsightsComponentFavoriteInner());
        this.manager = manager;
        // Set resource name
        this.favoriteId = name;
        //
    }

    ApplicationInsightsComponentFavoriteImpl(ApplicationInsightsComponentFavoriteInner inner, InsightsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.favoriteId = inner.name();
        // resource ancestor names
        //
    }

    @Override
    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApplicationInsightsComponentFavorite> createResourceAsync() {
        FavoritesInner client = this.manager().inner().favorites();
        return client.addAsync(this.resourceGroupName, this.resourceName, this.favoriteId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationInsightsComponentFavorite> updateResourceAsync() {
        FavoritesInner client = this.manager().inner().favorites();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<ApplicationInsightsComponentFavoriteInner> getInnerAsync() {
        FavoritesInner client = this.manager().inner().favorites();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() { return false; }


    @Override
    public String category() {
        return this.inner().category();
    }

    @Override
    public String config() {
        return this.inner().config();
    }

    @Override
    public String favoriteId() {
        return this.inner().favoriteId();
    }

    @Override
    public FavoriteType favoriteType() {
        return this.inner().favoriteType();
    }

    @Override
    public Boolean isGeneratedFromTemplate() {
        return this.inner().isGeneratedFromTemplate();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String sourceType() {
        return this.inner().sourceType();
    }

    @Override
    public List<String> tags() {
        return this.inner().tags();
    }

    @Override
    public String timeModified() {
        return this.inner().timeModified();
    }

    @Override
    public String userId() {
        return this.inner().userId();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withExistingComponent(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withCategory(String category) {
        this.inner().withCategory(category);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withConfig(String config) {
        this.inner().withConfig(config);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withFavoriteType(FavoriteType favoriteType) {
        this.inner().withFavoriteType(favoriteType);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withIsGeneratedFromTemplate(Boolean isGeneratedFromTemplate) {
        this.inner().withIsGeneratedFromTemplate(isGeneratedFromTemplate);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withSourceType(String sourceType) {
        this.inner().withSourceType(sourceType);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withTags(List<String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl withVersion(String version) {
        this.inner().withVersion(version);
        return this;
    }

}
