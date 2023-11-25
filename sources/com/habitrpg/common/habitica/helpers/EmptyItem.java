package com.habitrpg.common.habitica.helpers;

import dc.w;
import qc.q;

/* compiled from: RecyclerViewEmptySupport.kt */
/* loaded from: classes4.dex */
public final class EmptyItem {
    private Integer iconResource;
    private pc.a<w> onButtonTap;
    private String text;
    private boolean tintedIcon;
    private String title;

    public EmptyItem(String str, String str2, Integer num, boolean z10, pc.a<w> aVar) {
        q.i(str, "title");
        this.title = str;
        this.text = str2;
        this.iconResource = num;
        this.tintedIcon = z10;
        this.onButtonTap = aVar;
    }

    public static /* synthetic */ EmptyItem copy$default(EmptyItem emptyItem, String str, String str2, Integer num, boolean z10, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emptyItem.title;
        }
        if ((i10 & 2) != 0) {
            str2 = emptyItem.text;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            num = emptyItem.iconResource;
        }
        Integer num2 = num;
        if ((i10 & 8) != 0) {
            z10 = emptyItem.tintedIcon;
        }
        boolean z11 = z10;
        pc.a<w> aVar2 = aVar;
        if ((i10 & 16) != 0) {
            aVar2 = emptyItem.onButtonTap;
        }
        return emptyItem.copy(str, str3, num2, z11, aVar2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final Integer component3() {
        return this.iconResource;
    }

    public final boolean component4() {
        return this.tintedIcon;
    }

    public final pc.a<w> component5() {
        return this.onButtonTap;
    }

    public final EmptyItem copy(String str, String str2, Integer num, boolean z10, pc.a<w> aVar) {
        q.i(str, "title");
        return new EmptyItem(str, str2, num, z10, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyItem)) {
            return false;
        }
        EmptyItem emptyItem = (EmptyItem) obj;
        if (q.d(this.title, emptyItem.title) && q.d(this.text, emptyItem.text) && q.d(this.iconResource, emptyItem.iconResource) && this.tintedIcon == emptyItem.tintedIcon && q.d(this.onButtonTap, emptyItem.onButtonTap)) {
            return true;
        }
        return false;
    }

    public final Integer getIconResource() {
        return this.iconResource;
    }

    public final pc.a<w> getOnButtonTap() {
        return this.onButtonTap;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getTintedIcon() {
        return this.tintedIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.title.hashCode() * 31;
        String str = this.text;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        Integer num = this.iconResource;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        boolean z10 = this.tintedIcon;
        int i13 = z10;
        if (z10 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        pc.a<w> aVar = this.onButtonTap;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i14 + i10;
    }

    public final void setIconResource(Integer num) {
        this.iconResource = num;
    }

    public final void setOnButtonTap(pc.a<w> aVar) {
        this.onButtonTap = aVar;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTintedIcon(boolean z10) {
        this.tintedIcon = z10;
    }

    public final void setTitle(String str) {
        q.i(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "EmptyItem(title=" + this.title + ", text=" + this.text + ", iconResource=" + this.iconResource + ", tintedIcon=" + this.tintedIcon + ", onButtonTap=" + this.onButtonTap + ")";
    }

    public /* synthetic */ EmptyItem(String str, String str2, Integer num, boolean z10, pc.a aVar, int i10, qc.h hVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : aVar);
    }
}
