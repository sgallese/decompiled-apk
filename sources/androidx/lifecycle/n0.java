package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f5016f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final Class<? extends Object>[] f5017g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f5018a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a.c> f5019b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b<?>> f5020c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, dd.x<Object>> f5021d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f5022e;

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final n0 a(Bundle bundle, Bundle bundle2) {
            boolean z10;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new n0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    qc.q.h(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new n0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    qc.q.g(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new n0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : n0.f5017g) {
                qc.q.f(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class b<T> extends f0<T> {

        /* renamed from: l  reason: collision with root package name */
        private String f5023l;

        /* renamed from: m  reason: collision with root package name */
        private n0 f5024m;

        @Override // androidx.lifecycle.f0, androidx.lifecycle.LiveData
        public void p(T t10) {
            n0 n0Var = this.f5024m;
            if (n0Var != null) {
                n0Var.f5018a.put(this.f5023l, t10);
                dd.x xVar = (dd.x) n0Var.f5021d.get(this.f5023l);
                if (xVar != null) {
                    xVar.setValue(t10);
                }
            }
            super.p(t10);
        }

        public final void q() {
            this.f5024m = null;
        }
    }

    public n0(Map<String, ? extends Object> map) {
        qc.q.i(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5018a = linkedHashMap;
        this.f5019b = new LinkedHashMap();
        this.f5020c = new LinkedHashMap();
        this.f5021d = new LinkedHashMap();
        this.f5022e = new a.c() { // from class: androidx.lifecycle.m0
            @Override // androidx.savedstate.a.c
            public final Bundle saveState() {
                Bundle i10;
                i10 = n0.i(n0.this);
                return i10;
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle i(n0 n0Var) {
        Map r10;
        qc.q.i(n0Var, "this$0");
        r10 = ec.n0.r(n0Var.f5019b);
        for (Map.Entry entry : r10.entrySet()) {
            n0Var.j((String) entry.getKey(), ((a.c) entry.getValue()).saveState());
        }
        Set<String> keySet = n0Var.f5018a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(n0Var.f5018a.get(str));
        }
        return androidx.core.os.e.a(dc.r.a("keys", arrayList), dc.r.a("values", arrayList2));
    }

    public final boolean e(String str) {
        qc.q.i(str, "key");
        return this.f5018a.containsKey(str);
    }

    public final <T> T f(String str) {
        qc.q.i(str, "key");
        try {
            return (T) this.f5018a.get(str);
        } catch (ClassCastException unused) {
            g(str);
            return null;
        }
    }

    public final <T> T g(String str) {
        qc.q.i(str, "key");
        T t10 = (T) this.f5018a.remove(str);
        b<?> remove = this.f5020c.remove(str);
        if (remove != null) {
            remove.q();
        }
        this.f5021d.remove(str);
        return t10;
    }

    public final a.c h() {
        return this.f5022e;
    }

    public final <T> void j(String str, T t10) {
        b<?> bVar;
        qc.q.i(str, "key");
        if (f5016f.b(t10)) {
            b<?> bVar2 = this.f5020c.get(str);
            if (bVar2 instanceof f0) {
                bVar = bVar2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.p(t10);
            } else {
                this.f5018a.put(str, t10);
            }
            dd.x<Object> xVar = this.f5021d.get(str);
            if (xVar != null) {
                xVar.setValue(t10);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        qc.q.f(t10);
        sb2.append(t10.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public n0() {
        this.f5018a = new LinkedHashMap();
        this.f5019b = new LinkedHashMap();
        this.f5020c = new LinkedHashMap();
        this.f5021d = new LinkedHashMap();
        this.f5022e = new a.c() { // from class: androidx.lifecycle.m0
            @Override // androidx.savedstate.a.c
            public final Bundle saveState() {
                Bundle i10;
                i10 = n0.i(n0.this);
                return i10;
            }
        };
    }
}
