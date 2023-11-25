package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<? extends Object>[] f2640a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f2641f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.a f2642m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f2643p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, androidx.savedstate.a aVar, String str) {
            super(0);
            this.f2641f = z10;
            this.f2642m = aVar;
            this.f2643p = str;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f2641f) {
                this.f2642m.j(this.f2643p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    /* loaded from: classes.dex */
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s0.f f2644a;

        b(s0.f fVar) {
            this.f2644a = fVar;
        }

        @Override // androidx.savedstate.a.c
        public final Bundle saveState() {
            return d1.f(this.f2644a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<Object, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f2645f = new c();

        c() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.l
        public final Boolean invoke(Object obj) {
            qc.q.i(obj, "it");
            return Boolean.valueOf(d1.e(obj));
        }
    }

    public static final c1 a(View view, w3.d dVar) {
        String str;
        qc.q.i(view, "view");
        qc.q.i(dVar, "owner");
        ViewParent parent = view.getParent();
        qc.q.g(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(v0.h.H);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return b(str, dVar);
    }

    public static final c1 b(String str, w3.d dVar) {
        Map<String, List<Object>> map;
        boolean z10;
        qc.q.i(str, "id");
        qc.q.i(dVar, "savedStateRegistryOwner");
        String str2 = s0.f.class.getSimpleName() + ':' + str;
        androidx.savedstate.a savedStateRegistry = dVar.getSavedStateRegistry();
        Bundle b10 = savedStateRegistry.b(str2);
        if (b10 != null) {
            map = g(b10);
        } else {
            map = null;
        }
        s0.f a10 = s0.h.a(map, c.f2645f);
        try {
            savedStateRegistry.h(str2, new b(a10));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new c1(a10, new a(z10, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object obj) {
        if (obj instanceof t0.q) {
            t0.q qVar = (t0.q) obj;
            if (qVar.c() != j0.y2.j() && qVar.c() != j0.y2.o() && qVar.c() != j0.y2.l()) {
                return false;
            }
            T value = qVar.getValue();
            if (value == 0) {
                return true;
            }
            return e(value);
        } else if ((obj instanceof dc.c) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> cls : f2640a) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle f(Map<String, ? extends List<? extends Object>> map) {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }

    private static final Map<String, List<Object>> g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        qc.q.h(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            qc.q.g(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            qc.q.h(str, "key");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
