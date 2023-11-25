package androidx.core.widget;

import android.widget.ListView;

/* compiled from: ListViewCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: ListViewCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        static void b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    public static boolean a(ListView listView, int i10) {
        return a.a(listView, i10);
    }

    public static void b(ListView listView, int i10) {
        a.b(listView, i10);
    }
}
