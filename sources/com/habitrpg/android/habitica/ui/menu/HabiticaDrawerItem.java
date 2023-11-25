package com.habitrpg.android.habitica.ui.menu;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.habitrpg.android.habitica.models.user.User;
import qc.h;
import qc.q;

/* compiled from: HabiticaDrawerItem.kt */
/* loaded from: classes4.dex */
public final class HabiticaDrawerItem {
    public static final int $stable = 8;
    private Bundle bundle;
    private final Drawable icon;
    private final String identifier;
    private boolean isEnabled;
    private final boolean isHeader;
    private boolean isVisible;
    private Integer itemViewType;
    private Drawable pillBackground;
    private String pillText;
    private boolean showBubble;
    private String subtitle;
    private Integer subtitleTextColor;
    private final String text;
    private int transitionId;
    private User user;

    public HabiticaDrawerItem(int i10, String str, String str2, Drawable drawable, boolean z10) {
        q.i(str, "identifier");
        q.i(str2, "text");
        this.transitionId = i10;
        this.identifier = str;
        this.text = str2;
        this.icon = drawable;
        this.isHeader = z10;
        this.isVisible = true;
        this.isEnabled = true;
    }

    public static /* synthetic */ HabiticaDrawerItem copy$default(HabiticaDrawerItem habiticaDrawerItem, int i10, String str, String str2, Drawable drawable, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = habiticaDrawerItem.transitionId;
        }
        if ((i11 & 2) != 0) {
            str = habiticaDrawerItem.identifier;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = habiticaDrawerItem.text;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            drawable = habiticaDrawerItem.icon;
        }
        Drawable drawable2 = drawable;
        if ((i11 & 16) != 0) {
            z10 = habiticaDrawerItem.isHeader;
        }
        return habiticaDrawerItem.copy(i10, str3, str4, drawable2, z10);
    }

    public final int component1() {
        return this.transitionId;
    }

    public final String component2() {
        return this.identifier;
    }

    public final String component3() {
        return this.text;
    }

    public final Drawable component4() {
        return this.icon;
    }

    public final boolean component5() {
        return this.isHeader;
    }

    public final HabiticaDrawerItem copy(int i10, String str, String str2, Drawable drawable, boolean z10) {
        q.i(str, "identifier");
        q.i(str2, "text");
        return new HabiticaDrawerItem(i10, str, str2, drawable, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HabiticaDrawerItem)) {
            return false;
        }
        HabiticaDrawerItem habiticaDrawerItem = (HabiticaDrawerItem) obj;
        if (this.transitionId == habiticaDrawerItem.transitionId && q.d(this.identifier, habiticaDrawerItem.identifier) && q.d(this.text, habiticaDrawerItem.text) && q.d(this.icon, habiticaDrawerItem.icon) && this.isHeader == habiticaDrawerItem.isHeader) {
            return true;
        }
        return false;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Integer getItemViewType() {
        return this.itemViewType;
    }

    public final Drawable getPillBackground() {
        return this.pillBackground;
    }

    public final String getPillText() {
        return this.pillText;
    }

    public final boolean getShowBubble() {
        return this.showBubble;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTransitionId() {
        return this.transitionId;
    }

    public final User getUser() {
        return this.user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.transitionId * 31) + this.identifier.hashCode()) * 31) + this.text.hashCode()) * 31;
        Drawable drawable = this.icon;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        boolean z10 = this.isHeader;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return i10 + i11;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isHeader() {
        return this.isHeader;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
    }

    public final void setItemViewType(Integer num) {
        this.itemViewType = num;
    }

    public final void setPillBackground(Drawable drawable) {
        this.pillBackground = drawable;
    }

    public final void setPillText(String str) {
        this.pillText = str;
    }

    public final void setShowBubble(boolean z10) {
        this.showBubble = z10;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setSubtitleTextColor(Integer num) {
        this.subtitleTextColor = num;
    }

    public final void setTransitionId(int i10) {
        this.transitionId = i10;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setVisible(boolean z10) {
        this.isVisible = z10;
    }

    public String toString() {
        return "HabiticaDrawerItem(transitionId=" + this.transitionId + ", identifier=" + this.identifier + ", text=" + this.text + ", icon=" + this.icon + ", isHeader=" + this.isHeader + ")";
    }

    public /* synthetic */ HabiticaDrawerItem(int i10, String str, String str2, Drawable drawable, boolean z10, int i11, h hVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : drawable, (i11 & 16) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HabiticaDrawerItem(int i10, String str) {
        this(i10, str, "", null, false, 24, null);
        q.i(str, "identifier");
    }
}
