package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public class w implements LayoutInflater.Factory2 {

    /* renamed from: f  reason: collision with root package name */
    final FragmentManager f4844f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(FragmentManager fragmentManager) {
        this.f4844f = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        h0 x10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4844f);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e3.c.f14021a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(e3.c.f14022b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(e3.c.f14023c, -1);
            String string = obtainStyledAttributes.getString(e3.c.f14024d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !u.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment i02 = resourceId != -1 ? this.f4844f.i0(resourceId) : null;
            if (i02 == null && string != null) {
                i02 = this.f4844f.j0(string);
            }
            if (i02 == null && id2 != -1) {
                i02 = this.f4844f.i0(id2);
            }
            if (i02 == null) {
                i02 = this.f4844f.w0().a(context.getClassLoader(), attributeValue);
                i02.mFromLayout = true;
                i02.mFragmentId = resourceId != 0 ? resourceId : id2;
                i02.mContainerId = id2;
                i02.mTag = string;
                i02.mInLayout = true;
                FragmentManager fragmentManager = this.f4844f;
                i02.mFragmentManager = fragmentManager;
                i02.mHost = fragmentManager.z0();
                i02.onInflate(this.f4844f.z0().f(), attributeSet, i02.mSavedFragmentState);
                x10 = this.f4844f.j(i02);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Fragment " + i02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!i02.mInLayout) {
                i02.mInLayout = true;
                FragmentManager fragmentManager2 = this.f4844f;
                i02.mFragmentManager = fragmentManager2;
                i02.mHost = fragmentManager2.z0();
                i02.onInflate(this.f4844f.z0().f(), attributeSet, i02.mSavedFragmentState);
                x10 = this.f4844f.x(i02);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + i02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            f3.b.g(i02, viewGroup);
            i02.mContainer = viewGroup;
            x10.m();
            x10.j();
            View view2 = i02.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (i02.mView.getTag() == null) {
                    i02.mView.setTag(string);
                }
                i02.mView.addOnAttachStateChangeListener(new a(x10));
                return i02.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h0 f4845f;

        a(h0 h0Var) {
            this.f4845f = h0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f4845f.k();
            this.f4845f.m();
            t0.r((ViewGroup) k10.mView.getParent(), w.this.f4844f).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
