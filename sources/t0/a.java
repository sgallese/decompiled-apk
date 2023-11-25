package t0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ListUtils.kt */
/* loaded from: classes.dex */
public final class a {
    private static final <T> void a(Appendable appendable, T t10, pc.l<? super T, ? extends CharSequence> lVar) {
        boolean z10;
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == null) {
            z10 = true;
        } else {
            z10 = t10 instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    private static final <T, A extends Appendable> A b(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l<? super T, ? extends CharSequence> lVar) {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String c(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l<? super T, ? extends CharSequence> lVar) {
        qc.q.i(list, "<this>");
        qc.q.i(charSequence, "separator");
        qc.q.i(charSequence2, "prefix");
        qc.q.i(charSequence3, "postfix");
        qc.q.i(charSequence4, "truncated");
        String sb2 = ((StringBuilder) b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        qc.q.h(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        int i12;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return c(list, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> Set<T> e(List<? extends T> list) {
        qc.q.i(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
