package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.l;
import dc.r;
import ec.t;
import ec.y;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kc.c;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import qc.h;
import qc.j0;
import qc.q;
import rc.a;
import yc.v;
import yc.w;

/* compiled from: Headers.kt */
/* loaded from: classes4.dex */
public final class Headers implements Iterable<l<? extends String, ? extends String>>, a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            int W;
            CharSequence T0;
            q.i(str, "line");
            W = w.W(str, ':', 0, false, 6, null);
            if (W != -1) {
                String substring = str.substring(0, W);
                q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                T0 = w.T0(substring);
                String obj = T0.toString();
                String substring2 = str.substring(W + 1);
                q.h(substring2, "this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(q.q("Unexpected header: ", str).toString());
        }

        public final Builder addAll(Headers headers) {
            q.i(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            int W;
            q.i(str, "line");
            W = w.W(str, ':', 1, false, 4, null);
            if (W != -1) {
                String substring = str.substring(0, W);
                q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(W + 1);
                q.h(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                q.h(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String get(String str) {
            boolean r10;
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int size = this.namesAndValues.size() - 2;
            int c10 = c.c(size, 0, -2);
            if (c10 > size) {
                return null;
            }
            while (true) {
                int i10 = size - 2;
                r10 = v.r(str, this.namesAndValues.get(size), true);
                if (r10) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size != c10) {
                    size = i10;
                } else {
                    return null;
                }
            }
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            boolean r10;
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int i10 = 0;
            while (i10 < getNamesAndValues$okhttp().size()) {
                r10 = v.r(str, getNamesAndValues$okhttp().get(i10), true);
                if (r10) {
                    getNamesAndValues$okhttp().remove(i10);
                    getNamesAndValues$okhttp().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(date, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(instant, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            CharSequence T0;
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            getNamesAndValues$okhttp().add(str);
            List<String> namesAndValues$okhttp = getNamesAndValues$okhttp();
            T0 = w.T0(str2);
            namesAndValues$okhttp.add(T0.toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(date, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(instant, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length();
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    char charAt = str.charAt(i10);
                    if ('!' <= charAt && charAt < 127) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i10 = i11;
                    } else {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[LOOP:0: B:3:0x0006->B:23:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void checkValue(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = 1
                goto L1e
            L1d:
                r5 = 0
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = 0
                goto L24
            L23:
                r5 = 1
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = okhttp3.internal.Util.format(r1, r0)
                boolean r9 = okhttp3.internal.Util.isSensitiveHeader(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = qc.q.q(r9, r8)
            L4d:
                java.lang.String r8 = qc.q.q(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.checkValue(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            boolean r10;
            int length = strArr.length - 2;
            int c10 = c.c(length, 0, -2);
            if (c10 > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                r10 = v.r(str, strArr[length], true);
                if (r10) {
                    return strArr[length + 1];
                }
                if (length != c10) {
                    length = i10;
                } else {
                    return null;
                }
            }
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m282deprecated_of(String... strArr) {
            q.i(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            CharSequence T0;
            q.i(strArr, "namesAndValues");
            int i10 = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    String str = strArr2[i11];
                    if (str != null) {
                        T0 = w.T0(str);
                        strArr2[i11] = T0.toString();
                        i11 = i12;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int c10 = c.c(0, strArr2.length - 1, 2);
                if (c10 >= 0) {
                    while (true) {
                        int i13 = i10 + 2;
                        String str2 = strArr2[i10];
                        String str3 = strArr2[i10 + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i10 == c10) {
                            break;
                        }
                        i10 = i13;
                    }
                }
                return new Headers(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m281deprecated_of(Map<String, String> map) {
            q.i(map, "headers");
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            CharSequence T0;
            CharSequence T02;
            q.i(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                T0 = w.T0(key);
                String obj = T0.toString();
                T02 = w.T0(value);
                String obj2 = T02.toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i10] = obj;
                strArr[i10 + 1] = obj2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, h hVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m280deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            length += this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues)) {
            return true;
        }
        return false;
    }

    public final String get(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        return DatesKt.toHttpDateOrNull(str2);
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Date date = getDate(str);
        if (date == null) {
            return null;
        }
        return DateRetargetClass.toInstant(date);
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<l<? extends String, ? extends String>> iterator() {
        int size = size();
        l[] lVarArr = new l[size];
        for (int i10 = 0; i10 < size; i10++) {
            lVarArr[i10] = r.a(name(i10), value(i10));
        }
        return qc.c.a(lVarArr);
    }

    public final String name(int i10) {
        return this.namesAndValues[i10 * 2];
    }

    public final Set<String> names() {
        Comparator t10;
        t10 = v.t(j0.f21683a);
        TreeSet treeSet = new TreeSet(t10);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        q.h(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        y.x(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator t10;
        t10 = v.t(j0.f21683a);
        TreeMap treeMap = new TreeMap(t10);
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String name = name(i10);
            Locale locale = Locale.US;
            q.h(locale, "US");
            String lowerCase = name.toLowerCase(locale);
            q.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i10));
            i10 = i11;
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String name = name(i10);
            String value = value(i10);
            sb2.append(name);
            sb2.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb2.append(value);
            sb2.append("\n");
            i10 = i11;
        }
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String value(int i10) {
        return this.namesAndValues[(i10 * 2) + 1];
    }

    public final List<String> values(String str) {
        List<String> i10;
        boolean r10;
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int size = size();
        ArrayList arrayList = null;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            r10 = v.r(str, name(i11), true);
            if (r10) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i11));
            }
            i11 = i12;
        }
        if (arrayList == null) {
            i10 = t.i();
            return i10;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        q.h(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
