package cb;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpannableBuilder.java */
/* loaded from: classes4.dex */
public class u implements Appendable, CharSequence {

    /* renamed from: f  reason: collision with root package name */
    private final StringBuilder f8944f;

    /* renamed from: m  reason: collision with root package name */
    private final Deque<a> f8945m;

    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f8946a;

        /* renamed from: b  reason: collision with root package name */
        public int f8947b;

        /* renamed from: c  reason: collision with root package name */
        public int f8948c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8949d;

        a(Object obj, int i10, int i11, int i12) {
            this.f8946a = obj;
            this.f8947b = i10;
            this.f8948c = i11;
            this.f8949d = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes4.dex */
    public static class b extends SpannableStringBuilder {
        b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public u() {
        this("");
    }

    private void e(int i10, CharSequence charSequence) {
        int i11;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                i11 = spans.length;
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                if (z10) {
                    for (int i12 = i11 - 1; i12 >= 0; i12--) {
                        Object obj = spans[i12];
                        i(obj, spanned.getSpanStart(obj) + i10, spanned.getSpanEnd(obj) + i10, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = spans[i13];
                    i(obj2, spanned.getSpanStart(obj2) + i10, spanned.getSpanEnd(obj2) + i10, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    static boolean g(int i10, int i11, int i12) {
        if (i12 > i11 && i11 >= 0 && i12 <= i10) {
            return true;
        }
        return false;
    }

    public static void j(u uVar, Object obj, int i10, int i11) {
        if (obj == null || !g(uVar.length(), i10, i11)) {
            return;
        }
        k(uVar, obj, i10, i11);
    }

    private static void k(u uVar, Object obj, int i10, int i11) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    k(uVar, obj2, i10, i11);
                }
                return;
            }
            uVar.i(obj, i10, i11, 33);
        }
    }

    @Override // java.lang.Appendable
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public u append(char c10) {
        this.f8944f.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public u append(CharSequence charSequence) {
        e(length(), charSequence);
        this.f8944f.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public u append(CharSequence charSequence, int i10, int i11) {
        CharSequence subSequence = charSequence.subSequence(i10, i11);
        e(length(), subSequence);
        this.f8944f.append(subSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f8944f.charAt(i10);
    }

    public u d(String str) {
        this.f8944f.append(str);
        return this;
    }

    public List<a> f(int i10, int i11) {
        int i12;
        int length = length();
        if (!g(length, i10, i11)) {
            return Collections.emptyList();
        }
        if (i10 == 0 && length == i11) {
            ArrayList arrayList = new ArrayList(this.f8945m);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> descendingIterator = this.f8945m.descendingIterator();
        while (descendingIterator.hasNext()) {
            a next = descendingIterator.next();
            int i13 = next.f8947b;
            if ((i13 >= i10 && i13 < i11) || (((i12 = next.f8948c) <= i11 && i12 > i10) || (i13 < i10 && i12 > i11))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char h() {
        return this.f8944f.charAt(length() - 1);
    }

    public u i(Object obj, int i10, int i11, int i12) {
        this.f8945m.push(new a(obj, i10, i11, i12));
        return this;
    }

    public SpannableStringBuilder l() {
        b bVar = new b(this.f8944f);
        for (a aVar : this.f8945m) {
            bVar.setSpan(aVar.f8946a, aVar.f8947b, aVar.f8948c, aVar.f8949d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f8944f.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        List<a> f10 = f(i10, i11);
        if (f10.isEmpty()) {
            return this.f8944f.subSequence(i10, i11);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8944f.subSequence(i10, i11));
        int length = spannableStringBuilder.length();
        for (a aVar : f10) {
            int max = Math.max(0, aVar.f8947b - i10);
            spannableStringBuilder.setSpan(aVar.f8946a, max, Math.min(length, (aVar.f8948c - aVar.f8947b) + max), aVar.f8949d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f8944f.toString();
    }

    public u(CharSequence charSequence) {
        this.f8945m = new ArrayDeque(8);
        this.f8944f = new StringBuilder(charSequence);
        e(0, charSequence);
    }
}
