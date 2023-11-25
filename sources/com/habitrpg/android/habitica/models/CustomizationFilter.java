package com.habitrpg.android.habitica.models;

import java.util.ArrayList;
import java.util.List;
import qc.h;
import qc.q;
import t.k;

/* compiled from: CustomizationFilter.kt */
/* loaded from: classes4.dex */
public final class CustomizationFilter {
    public static final int $stable = 8;
    private boolean ascending;
    private List<String> months;
    private boolean onlyPurchased;

    public CustomizationFilter() {
        this(false, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizationFilter copy$default(CustomizationFilter customizationFilter, boolean z10, boolean z11, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = customizationFilter.onlyPurchased;
        }
        if ((i10 & 2) != 0) {
            z11 = customizationFilter.ascending;
        }
        if ((i10 & 4) != 0) {
            list = customizationFilter.months;
        }
        return customizationFilter.copy(z10, z11, list);
    }

    public final boolean component1() {
        return this.onlyPurchased;
    }

    public final boolean component2() {
        return this.ascending;
    }

    public final List<String> component3() {
        return this.months;
    }

    public final CustomizationFilter copy(boolean z10, boolean z11, List<String> list) {
        q.i(list, "months");
        return new CustomizationFilter(z10, z11, list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CustomizationFilter) {
            CustomizationFilter customizationFilter = (CustomizationFilter) obj;
            if (this.onlyPurchased == customizationFilter.onlyPurchased && this.ascending == customizationFilter.ascending && this.months.size() == customizationFilter.months.size() && this.months.containsAll(customizationFilter.months)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public final boolean getAscending() {
        return this.ascending;
    }

    public final List<String> getMonths() {
        return this.months;
    }

    public final boolean getOnlyPurchased() {
        return this.onlyPurchased;
    }

    public int hashCode() {
        return (((k.a(this.onlyPurchased) * 31) + k.a(this.ascending)) * 31) + this.months.hashCode();
    }

    public final boolean isFiltering() {
        if (this.onlyPurchased || (!this.months.isEmpty()) != false) {
            return true;
        }
        return false;
    }

    public final void setAscending(boolean z10) {
        this.ascending = z10;
    }

    public final void setMonths(List<String> list) {
        q.i(list, "<set-?>");
        this.months = list;
    }

    public final void setOnlyPurchased(boolean z10) {
        this.onlyPurchased = z10;
    }

    public String toString() {
        return "CustomizationFilter(onlyPurchased=" + this.onlyPurchased + ", ascending=" + this.ascending + ", months=" + this.months + ")";
    }

    public CustomizationFilter(boolean z10, boolean z11, List<String> list) {
        q.i(list, "months");
        this.onlyPurchased = z10;
        this.ascending = z11;
        this.months = list;
    }

    public /* synthetic */ CustomizationFilter(boolean z10, boolean z11, List list, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? new ArrayList() : list);
    }
}
