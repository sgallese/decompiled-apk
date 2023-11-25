package com.google.common.collect;

import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes3.dex */
public final class q {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    private static abstract class a implements e8.d<Map.Entry<?, ?>, Object> {
        public static final a KEY = new C0244a("KEY", 0);
        public static final a VALUE = new b("VALUE", 1);
        private static final /* synthetic */ a[] $VALUES = $values();

        /* compiled from: Maps.java */
        /* renamed from: com.google.common.collect.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0244a extends a {
            C0244a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.q.a, e8.d
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        /* loaded from: classes3.dex */
        enum b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.q.a, e8.d
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ a[] $values() {
            return new a[]{KEY, VALUE};
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // e8.d
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);

        /* synthetic */ a(String str, int i10, p pVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Map<?, ?> map) {
        StringBuilder a10 = e.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            a10.append(entry.getKey());
            a10.append('=');
            a10.append(entry.getValue());
            z10 = false;
        }
        a10.append('}');
        return a10.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> e8.d<Map.Entry<?, V>, V> c() {
        return a.VALUE;
    }
}
