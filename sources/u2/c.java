package u2;

import android.os.Build;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import androidx.core.util.e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u2.c;

/* compiled from: LinkifyCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f24095a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<a> f24096b = new Comparator() { // from class: u2.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g10;
            g10 = c.g((c.a) obj, (c.a) obj2);
            return g10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkifyCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        URLSpan f24097a;

        /* renamed from: b  reason: collision with root package name */
        String f24098b;

        /* renamed from: c  reason: collision with root package name */
        int f24099c;

        /* renamed from: d  reason: collision with root package name */
        int f24100d;

        a() {
        }
    }

    public static boolean b(Spannable spannable, int i10) {
        if (j()) {
            return Linkify.addLinks(spannable, i10);
        }
        if (i10 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            e(arrayList, spannable, e.f4057h, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i10 & 2) != 0) {
            e(arrayList, spannable, e.f4058i, new String[]{"mailto:"}, null, null);
        }
        if ((i10 & 8) != 0) {
            f(arrayList, spannable);
        }
        i(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f24097a == null) {
                c(aVar.f24098b, aVar.f24099c, aVar.f24100d, spannable);
            }
        }
        return true;
    }

    private static void c(String str, int i10, int i11, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i10, i11, 33);
    }

    private static String d(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return u2.a.c(str);
    }

    private static void e(ArrayList<a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    a aVar = new a();
                    aVar.f24098b = h(group, strArr, matcher, transformFilter);
                    aVar.f24099c = start;
                    aVar.f24100d = end;
                    arrayList.add(aVar);
                }
            }
        }
    }

    private static void f(ArrayList<a> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i10 = 0;
        while (true) {
            try {
                String d10 = d(obj);
                if (d10 != null && (indexOf = obj.indexOf(d10)) >= 0) {
                    a aVar = new a();
                    int length = d10.length() + indexOf;
                    aVar.f24099c = indexOf + i10;
                    i10 += length;
                    aVar.f24100d = i10;
                    obj = obj.substring(length);
                    try {
                        aVar.f24098b = "geo:0,0?q=" + URLEncoder.encode(d10, "UTF-8");
                        arrayList.add(aVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(a aVar, a aVar2) {
        int i10 = aVar.f24099c;
        int i11 = aVar2.f24099c;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return Integer.compare(aVar2.f24100d, aVar.f24100d);
    }

    private static String h(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z10;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                String str2 = strArr[i10];
                if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                    z10 = true;
                    if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                        str = str2 + str.substring(str2.length());
                    }
                } else {
                    i10++;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10 && strArr.length > 0) {
            return strArr[0] + str;
        }
        return str;
    }

    private static void i(ArrayList<a> arrayList, Spannable spannable) {
        int i10;
        int i11;
        int i12 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            a aVar = new a();
            aVar.f24097a = uRLSpan;
            aVar.f24099c = spannable.getSpanStart(uRLSpan);
            aVar.f24100d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(aVar);
        }
        Collections.sort(arrayList, f24096b);
        int size = arrayList.size();
        while (i12 < size - 1) {
            a aVar2 = arrayList.get(i12);
            int i13 = i12 + 1;
            a aVar3 = arrayList.get(i13);
            int i14 = aVar2.f24099c;
            int i15 = aVar3.f24099c;
            if (i14 <= i15 && (i10 = aVar2.f24100d) > i15) {
                int i16 = aVar3.f24100d;
                if (i16 <= i10 || i10 - i14 > i16 - i15) {
                    i11 = i13;
                } else if (i10 - i14 < i16 - i15) {
                    i11 = i12;
                } else {
                    i11 = -1;
                }
                if (i11 != -1) {
                    Object obj = arrayList.get(i11).f24097a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i11);
                    size--;
                }
            }
            i12 = i13;
        }
    }

    private static boolean j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
