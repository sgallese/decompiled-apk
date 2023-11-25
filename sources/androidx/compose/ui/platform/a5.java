package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    public static final a5 f2611a = new a5();

    private a5() {
    }

    public final Map<Integer, Integer> a(View view) {
        Map<Integer, Integer> attributeSourceResourceMap;
        qc.q.i(view, "view");
        attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        qc.q.h(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
