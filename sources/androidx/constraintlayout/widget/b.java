package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: f  reason: collision with root package name */
    protected int[] f3279f;

    /* renamed from: m  reason: collision with root package name */
    protected int f3280m;

    /* renamed from: p  reason: collision with root package name */
    protected Context f3281p;

    /* renamed from: q  reason: collision with root package name */
    protected o2.i f3282q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f3283r;

    /* renamed from: s  reason: collision with root package name */
    protected String f3284s;

    /* renamed from: t  reason: collision with root package name */
    private View[] f3285t;

    /* renamed from: u  reason: collision with root package name */
    private HashMap<Integer, String> f3286u;

    public b(Context context) {
        super(context);
        this.f3279f = new int[32];
        this.f3283r = false;
        this.f3285t = null;
        this.f3286u = new HashMap<>();
        this.f3281p = context;
        g(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f3281p == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int f10 = f(trim);
        if (f10 != 0) {
            this.f3286u.put(Integer.valueOf(f10), trim);
            b(f10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f3280m + 1;
        int[] iArr = this.f3279f;
        if (i11 > iArr.length) {
            this.f3279f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3279f;
        int i12 = this.f3280m;
        iArr2[i12] = i10;
        this.f3280m = i12 + 1;
    }

    private int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f3281p.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f10 = constraintLayout.f(0, str);
            if (f10 instanceof Integer) {
                i10 = ((Integer) f10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = e(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = i.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i10 == 0) {
            return this.f3281p.getResources().getIdentifier(str, "id", this.f3281p.getPackageName());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    protected void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f3280m; i10++) {
            View h10 = constraintLayout.h(this.f3279f[i10]);
            if (h10 != null) {
                h10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    h10.setTranslationZ(h10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f3394a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.f3527t1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3284s = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3279f, this.f3280m);
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e10;
        if (isInEditMode()) {
            setIds(this.f3284s);
        }
        o2.i iVar = this.f3282q;
        if (iVar == null) {
            return;
        }
        iVar.a();
        for (int i10 = 0; i10 < this.f3280m; i10++) {
            int i11 = this.f3279f[i10];
            View h10 = constraintLayout.h(i11);
            if (h10 == null && (e10 = e(constraintLayout, (str = this.f3286u.get(Integer.valueOf(i11))))) != 0) {
                this.f3279f[i10] = e10;
                this.f3286u.put(Integer.valueOf(e10), str);
                h10 = constraintLayout.h(e10);
            }
            if (h10 != null) {
                this.f3282q.b(constraintLayout.i(h10));
            }
        }
        this.f3282q.c(constraintLayout.f3209p);
    }

    public void m() {
        if (this.f3282q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f3248n0 = (o2.e) this.f3282q;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3284s;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f3283r) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f3284s = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f3280m = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3284s = null;
        this.f3280m = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3279f = new int[32];
        this.f3283r = false;
        this.f3285t = null;
        this.f3286u = new HashMap<>();
        this.f3281p = context;
        g(attributeSet);
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void h(o2.e eVar, boolean z10) {
    }
}
