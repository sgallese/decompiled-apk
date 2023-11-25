package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.l;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class e extends i implements Animatable {

    /* renamed from: m  reason: collision with root package name */
    private c f7187m;

    /* renamed from: p  reason: collision with root package name */
    private Context f7188p;

    /* renamed from: q  reason: collision with root package name */
    private ArgbEvaluator f7189q;

    /* renamed from: r  reason: collision with root package name */
    d f7190r;

    /* renamed from: s  reason: collision with root package name */
    private Animator.AnimatorListener f7191s;

    /* renamed from: t  reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f7192t;

    /* renamed from: u  reason: collision with root package name */
    final Drawable.Callback f7193u;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            e.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            e.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            e.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(e.this.f7192t);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(e.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(e.this.f7192t);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(e.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f7196a;

        /* renamed from: b  reason: collision with root package name */
        j f7197b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f7198c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f7199d;

        /* renamed from: e  reason: collision with root package name */
        androidx.collection.a<Animator, String> f7200e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f7196a = cVar.f7196a;
                j jVar = cVar.f7197b;
                if (jVar != null) {
                    Drawable.ConstantState constantState = jVar.getConstantState();
                    if (resources != null) {
                        this.f7197b = (j) constantState.newDrawable(resources);
                    } else {
                        this.f7197b = (j) constantState.newDrawable();
                    }
                    j jVar2 = (j) this.f7197b.mutate();
                    this.f7197b = jVar2;
                    jVar2.setCallback(callback);
                    this.f7197b.setBounds(cVar.f7197b.getBounds());
                    this.f7197b.h(false);
                }
                ArrayList<Animator> arrayList = cVar.f7199d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f7199d = new ArrayList<>(size);
                    this.f7200e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = cVar.f7199d.get(i10);
                        Animator clone = animator.clone();
                        String str = cVar.f7200e.get(animator);
                        clone.setTarget(this.f7197b.d(str));
                        this.f7199d.add(clone);
                        this.f7200e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f7198c == null) {
                this.f7198c = new AnimatorSet();
            }
            this.f7198c.playTogether(this.f7199d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7196a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    e() {
        this(null, null, null);
    }

    public static e a(Context context, int i10) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            e eVar = new e(context);
            Drawable e10 = androidx.core.content.res.h.e(context.getResources(), i10, context.getTheme());
            eVar.f7204f = e10;
            e10.setCallback(eVar.f7193u);
            eVar.f7190r = new d(eVar.f7204f.getConstantState());
            return eVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e11) {
            Log.e("AnimatedVDCompat", "parser error", e11);
            return null;
        } catch (XmlPullParserException e12) {
            Log.e("AnimatedVDCompat", "parser error", e12);
            return null;
        }
    }

    public static e b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        e eVar = new e(context);
        eVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return eVar;
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void e() {
        Animator.AnimatorListener animatorListener = this.f7191s;
        if (animatorListener != null) {
            this.f7187m.f7198c.removeListener(animatorListener);
            this.f7191s = null;
        }
    }

    private void f(String str, Animator animator) {
        animator.setTarget(this.f7187m.f7197b.d(str));
        c cVar = this.f7187m;
        if (cVar.f7199d == null) {
            cVar.f7199d = new ArrayList<>();
            this.f7187m.f7200e = new androidx.collection.a<>();
        }
        this.f7187m.f7199d.add(animator);
        this.f7187m.f7200e.put(animator, str);
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        boolean unregisterAnimationCallback;
        unregisterAnimationCallback = animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
        return unregisterAnimationCallback;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public void c(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, bVar);
        } else if (bVar == null) {
        } else {
            if (this.f7192t == null) {
                this.f7192t = new ArrayList<>();
            }
            if (this.f7192t.contains(bVar)) {
                return;
            }
            this.f7192t.add(bVar);
            if (this.f7191s == null) {
                this.f7191s = new b();
            }
            this.f7187m.f7198c.addListener(this.f7191s);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f7187m.f7197b.draw(canvas);
        if (this.f7187m.f7198c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean g(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f7192t;
        if (arrayList != null && bVar != null) {
            boolean remove = arrayList.remove(bVar);
            if (this.f7192t.size() == 0) {
                e();
            }
            return remove;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f7187m.f7197b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f7187m.f7196a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f7187m.f7197b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f7204f != null && Build.VERSION.SDK_INT >= 24) {
            return new d(this.f7204f.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f7187m.f7197b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f7187m.f7197b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f7187m.f7197b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s10 = l.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7177e);
                    int resourceId = s10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        j b10 = j.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.f7193u);
                        j jVar = this.f7187m.f7197b;
                        if (jVar != null) {
                            jVar.setCallback(null);
                        }
                        this.f7187m.f7197b = b10;
                    }
                    s10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f7178f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f7188p;
                        if (context != null) {
                            f(string, g.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f7187m.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f7187m.f7197b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f7187m.f7198c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f7187m.f7197b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7187m.f7197b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f7187m.f7197b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f7187m.f7197b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f7187m.f7197b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f7187m.f7197b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            this.f7187m.f7197b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f7187m.f7197b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f7187m.f7197b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f7187m.f7197b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f7187m.f7198c.isStarted()) {
        } else {
            this.f7187m.f7198c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7187m.f7198c.end();
        }
    }

    private e(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7204f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7187m.f7197b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class d extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f7201a;

        public d(Drawable.ConstantState constantState) {
            this.f7201a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f7201a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7201a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            e eVar = new e();
            Drawable newDrawable = this.f7201a.newDrawable();
            eVar.f7204f = newDrawable;
            newDrawable.setCallback(eVar.f7193u);
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            e eVar = new e();
            Drawable newDrawable = this.f7201a.newDrawable(resources);
            eVar.f7204f = newDrawable;
            newDrawable.setCallback(eVar.f7193u);
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            e eVar = new e();
            Drawable newDrawable = this.f7201a.newDrawable(resources, theme);
            eVar.f7204f = newDrawable;
            newDrawable.setCallback(eVar.f7193u);
            return eVar;
        }
    }

    private e(Context context, c cVar, Resources resources) {
        this.f7189q = null;
        this.f7191s = null;
        this.f7192t = null;
        a aVar = new a();
        this.f7193u = aVar;
        this.f7188p = context;
        if (cVar != null) {
            this.f7187m = cVar;
        } else {
            this.f7187m = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
