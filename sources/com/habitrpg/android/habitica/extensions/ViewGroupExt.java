package com.habitrpg.android.habitica.extensions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: ViewGroupExtensions.kt */
/* loaded from: classes4.dex */
public final class ViewGroupExt {
    public static final View inflate(ViewGroup viewGroup, int i10, boolean z10) {
        q.i(viewGroup, "<this>");
        Context context = viewGroup.getContext();
        q.h(context, "getContext(...)");
        View inflate = ContextExtensionsKt.getLayoutInflater(context).inflate(i10, viewGroup, z10);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    public static /* synthetic */ View inflate$default(ViewGroup viewGroup, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return inflate(viewGroup, i10, z10);
    }
}
