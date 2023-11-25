package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import g.j;

/* compiled from: ActionBarPolicy.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f945a;

    private a(Context context) {
        this.f945a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        if (this.f945a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.f945a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f945a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600) {
            if (i10 <= 960 || i11 <= 720) {
                if (i10 <= 720 || i11 <= 960) {
                    if (i10 < 500) {
                        if (i10 <= 640 || i11 <= 480) {
                            if (i10 <= 480 || i11 <= 640) {
                                if (i10 >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f945a.getResources().getDimensionPixelSize(g.d.f15726b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f945a.obtainStyledAttributes(null, j.f15832a, g.a.f15692c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f15879j, 0);
        Resources resources = this.f945a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(g.d.f15725a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f945a.getResources().getBoolean(g.b.f15716a);
    }

    public boolean h() {
        return true;
    }
}
