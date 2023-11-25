package androidx.room;

import android.content.Context;
import androidx.room.i;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import x3.c;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final c.InterfaceC0584c f6960a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f6961b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6962c;

    /* renamed from: d  reason: collision with root package name */
    public final i.d f6963d;

    /* renamed from: e  reason: collision with root package name */
    public final List<i.b> f6964e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6965f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c f6966g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f6967h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f6968i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6969j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6970k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6971l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f6972m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6973n;

    /* renamed from: o  reason: collision with root package name */
    public final File f6974o;

    public a(Context context, String str, c.InterfaceC0584c interfaceC0584c, i.d dVar, List<i.b> list, boolean z10, i.c cVar, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f6960a = interfaceC0584c;
        this.f6961b = context;
        this.f6962c = str;
        this.f6963d = dVar;
        this.f6964e = list;
        this.f6965f = z10;
        this.f6966g = cVar;
        this.f6967h = executor;
        this.f6968i = executor2;
        this.f6969j = z11;
        this.f6970k = z12;
        this.f6971l = z13;
        this.f6972m = set;
        this.f6973n = str2;
        this.f6974o = file;
    }

    public boolean a(int i10, int i11) {
        boolean z10;
        Set<Integer> set;
        if (i10 > i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 || !this.f6971l) && this.f6970k && ((set = this.f6972m) == null || !set.contains(Integer.valueOf(i10)))) {
            return true;
        }
        return false;
    }
}
