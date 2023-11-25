package com.habitrpg.android.habitica.models.social;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import io.realm.d1;
import io.realm.d5;
import io.realm.internal.o;
import java.util.Date;
import qc.q;

/* compiled from: InboxConversation.kt */
/* loaded from: classes4.dex */
public class InboxConversation extends d1 implements BaseObject, d5 {
    public static final int $stable = 8;
    private String combinedID;
    private ContributorInfo contributor;
    private String text;
    private Date timestamp;
    private String user;
    private String userID;
    private UserStyles userStyles;
    private String username;
    private String uuid;

    public InboxConversation() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$combinedID("");
        realmSet$uuid("");
        realmSet$userID("");
    }

    public final String getCombinedID() {
        return realmGet$combinedID();
    }

    public final ContributorInfo getContributor() {
        return realmGet$contributor();
    }

    public final String getFormattedUsername() {
        boolean z10;
        String realmGet$username = realmGet$username();
        boolean z11 = false;
        if (realmGet$username != null) {
            if (realmGet$username.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            return "@" + realmGet$username();
        }
        return null;
    }

    public final String getText() {
        return realmGet$text();
    }

    public final Date getTimestamp() {
        return realmGet$timestamp();
    }

    public final String getUser() {
        return realmGet$user();
    }

    public final String getUserID() {
        return realmGet$userID();
    }

    public final UserStyles getUserStyles() {
        return realmGet$userStyles();
    }

    public final String getUsername() {
        return realmGet$username();
    }

    public final String getUuid() {
        return realmGet$uuid();
    }

    @Override // io.realm.d5
    public String realmGet$combinedID() {
        return this.combinedID;
    }

    @Override // io.realm.d5
    public ContributorInfo realmGet$contributor() {
        return this.contributor;
    }

    @Override // io.realm.d5
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.d5
    public Date realmGet$timestamp() {
        return this.timestamp;
    }

    @Override // io.realm.d5
    public String realmGet$user() {
        return this.user;
    }

    @Override // io.realm.d5
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.d5
    public UserStyles realmGet$userStyles() {
        return this.userStyles;
    }

    @Override // io.realm.d5
    public String realmGet$username() {
        return this.username;
    }

    @Override // io.realm.d5
    public String realmGet$uuid() {
        return this.uuid;
    }

    @Override // io.realm.d5
    public void realmSet$combinedID(String str) {
        this.combinedID = str;
    }

    @Override // io.realm.d5
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        this.contributor = contributorInfo;
    }

    @Override // io.realm.d5
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.d5
    public void realmSet$timestamp(Date date) {
        this.timestamp = date;
    }

    @Override // io.realm.d5
    public void realmSet$user(String str) {
        this.user = str;
    }

    @Override // io.realm.d5
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    @Override // io.realm.d5
    public void realmSet$userStyles(UserStyles userStyles) {
        this.userStyles = userStyles;
    }

    @Override // io.realm.d5
    public void realmSet$username(String str) {
        this.username = str;
    }

    @Override // io.realm.d5
    public void realmSet$uuid(String str) {
        this.uuid = str;
    }

    public final void setCombinedID(String str) {
        q.i(str, "<set-?>");
        realmSet$combinedID(str);
    }

    public final void setContributor(ContributorInfo contributorInfo) {
        realmSet$contributor(contributorInfo);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setTimestamp(Date date) {
        realmSet$timestamp(date);
    }

    public final void setUser(String str) {
        realmSet$user(str);
    }

    public final void setUserID(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$userID(str);
        realmSet$combinedID(str + realmGet$uuid());
    }

    public final void setUserStyles(UserStyles userStyles) {
        realmSet$userStyles(userStyles);
    }

    public final void setUsername(String str) {
        realmSet$username(str);
    }

    public final void setUuid(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$uuid(str);
        realmSet$combinedID(realmGet$userID() + str);
    }
}
