package com.habitrpg.shared.habitica.models.responses;

/* compiled from: MaintenanceResponse.kt */
/* loaded from: classes4.dex */
public final class MaintenanceResponse {
    private Boolean activeMaintenance;
    private String description;
    private String imageUrl;
    private Integer minBuild;
    private String title;

    public final Boolean getActiveMaintenance() {
        return this.activeMaintenance;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getMinBuild() {
        return this.minBuild;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setActiveMaintenance(Boolean bool) {
        this.activeMaintenance = bool;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setMinBuild(Integer num) {
        this.minBuild = num;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
