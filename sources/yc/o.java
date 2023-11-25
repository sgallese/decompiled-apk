package yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
/* loaded from: classes4.dex */
public class o extends n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* loaded from: classes4.dex */
    public static final class a extends qc.r implements pc.l<String, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f26338f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            qc.q.i(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    /* loaded from: classes4.dex */
    public static final class b extends qc.r implements pc.l<String, String> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f26339f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f26339f = str;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            qc.q.i(str, "line");
            return this.f26339f + str;
        }
    }

    private static final pc.l<String, String> b(String str) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return a.f26338f;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if ((!yc.b.c(str.charAt(i10))) == true) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    public static final String d(String str, String str2) {
        int i10;
        String invoke;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "newIndent");
        List<String> f02 = w.f0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f02) {
            if ((!m.u((String) obj)) != false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ec.r.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) ec.r.p0(arrayList2);
        int i11 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int length = str.length() + (str2.length() * f02.size());
        pc.l<String, String> b10 = b(str2);
        int k10 = ec.r.k(f02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : f02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ec.r.r();
            }
            String str3 = (String) obj2;
            if ((i11 == 0 || i11 == k10) && m.u(str3)) {
                str3 = null;
            } else {
                String V0 = m.V0(str3, i10);
                if (V0 != null && (invoke = b10.invoke(V0)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i11 = i12;
        }
        String sb2 = ((StringBuilder) ec.r.i0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        qc.q.h(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static final String e(String str, String str2, String str3) {
        int i10;
        String invoke;
        qc.q.i(str, "<this>");
        qc.q.i(str2, "newIndent");
        qc.q.i(str3, "marginPrefix");
        if ((!m.u(str3)) != false) {
            List<String> f02 = w.f0(str);
            int length = str.length() + (str2.length() * f02.size());
            pc.l<String, String> b10 = b(str2);
            int k10 = ec.r.k(f02);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : f02) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    ec.r.r();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i11 == 0 || i11 == k10) && m.u(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            if ((!yc.b.c(str4.charAt(i13))) != false) {
                                i10 = i13;
                                break;
                            }
                            i13++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 != -1) {
                        int i14 = i10;
                        if (m.E(str4, str3, i10, false, 4, null)) {
                            int length3 = i14 + str3.length();
                            qc.q.g(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(length3);
                            qc.q.h(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (invoke = b10.invoke(str5)) != null) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i11 = i12;
            }
            String sb2 = ((StringBuilder) ec.r.i0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            qc.q.h(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static String f(String str) {
        qc.q.i(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        qc.q.i(str, "<this>");
        qc.q.i(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
