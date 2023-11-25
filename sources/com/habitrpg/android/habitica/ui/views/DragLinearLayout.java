package com.habitrpg.android.habitica.ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.DragLinearLayout;
import qc.q;

/* compiled from: DragLinearLayout.kt */
/* loaded from: classes4.dex */
public class DragLinearLayout extends LinearLayout {
    private static final int DEFAULT_SCROLL_SENSITIVE_AREA_HEIGHT_DP = 48;
    private static final int INVALID_POINTER_ID = -1;
    private static final int MAX_DRAG_SCROLL_SPEED = 16;
    private static final long MAX_SWITCH_DURATION = 300;
    private static final long MIN_SWITCH_DURATION = 150;
    private static final float NOMINAL_DISTANCE = 20.0f;
    private static final long NOMINAL_SWITCH_DURATION = 150;
    private int activePointerId;
    private ScrollView containerScrollView;
    private int downY;
    private final Drawable dragBottomShadowDrawable;
    private final int dragShadowHeight;
    private final Drawable dragTopShadowDrawable;
    private Runnable dragUpdater;
    private final SparseArray<DraggableChild> draggableChildren;
    private final DragItem draggedItem;
    private final float nominalDistanceScaled;
    private int scrollSensitiveHeight;
    private final int slop;
    private OnViewSwapListener swapListener;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = DragLinearLayout.class.getSimpleName();

    /* compiled from: DragLinearLayout.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap getBitmapFromView(View view) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            q.h(createBitmap, "createBitmap(...)");
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float smootherStep(float f10, float f11, float f12) {
            float max = Math.max(0.0f, Math.min((f12 - f10) / (f11 - f10), 1.0f));
            return max * max * max * ((max * ((6 * max) - 15)) + 10);
        }
    }

    /* compiled from: DragLinearLayout.kt */
    /* loaded from: classes4.dex */
    private final class DragHandleOnTouchListener implements View.OnTouchListener {
        final /* synthetic */ DragLinearLayout this$0;
        private final View view;

        public DragHandleOnTouchListener(DragLinearLayout dragLinearLayout, View view) {
            q.i(view, "view");
            this.this$0 = dragLinearLayout;
            this.view = view;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            q.i(view, "v");
            q.i(motionEvent, "event");
            this.view.performClick();
            if (motionEvent.getActionMasked() == 0) {
                this.this$0.startDetectingDrag(this.view);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DragLinearLayout.kt */
    /* loaded from: classes4.dex */
    public final class DragItem {
        private boolean detecting;
        private boolean dragging;
        private int height;
        private int position;
        private ValueAnimator settleAnimation;
        private int startTop;
        private int startVisibility;
        private int targetTopOffset;
        private int totalDragOffset;
        private View view;
        private BitmapDrawable viewDrawable;

        public DragItem() {
            stopDetecting();
        }

        public final boolean getDetecting() {
            return this.detecting;
        }

        public final boolean getDragging() {
            return this.dragging;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getPosition() {
            return this.position;
        }

        public final ValueAnimator getSettleAnimation() {
            return this.settleAnimation;
        }

        public final int getStartTop() {
            return this.startTop;
        }

        public final int getTargetTopOffset() {
            return this.targetTopOffset;
        }

        public final int getTotalDragOffset() {
            return this.totalDragOffset;
        }

        public final View getView() {
            return this.view;
        }

        public final BitmapDrawable getViewDrawable() {
            return this.viewDrawable;
        }

        public final void onDragStart() {
            View view = this.view;
            if (view != null) {
                view.setVisibility(4);
            }
            this.dragging = true;
        }

        public final void onDragStop() {
            this.dragging = false;
        }

        public final void setDetecting(boolean z10) {
            this.detecting = z10;
        }

        public final void setDragging(boolean z10) {
            this.dragging = z10;
        }

        public final void setHeight(int i10) {
            this.height = i10;
        }

        public final void setPosition(int i10) {
            this.position = i10;
        }

        public final void setSettleAnimation(ValueAnimator valueAnimator) {
            this.settleAnimation = valueAnimator;
        }

        public final void setStartTop(int i10) {
            this.startTop = i10;
        }

        public final void setTargetTopOffset(int i10) {
            this.targetTopOffset = i10;
        }

        public final void setTotalDragOffset(int i10) {
            this.totalDragOffset = i10;
        }

        public final void setTotalOffset(int i10) {
            this.totalDragOffset = i10;
            updateTargetTop();
        }

        public final void setView(View view) {
            this.view = view;
        }

        public final void setViewDrawable(BitmapDrawable bitmapDrawable) {
            this.viewDrawable = bitmapDrawable;
        }

        public final boolean settling() {
            if (this.settleAnimation != null) {
                return true;
            }
            return false;
        }

        public final void startDetectingOnPossibleDrag(View view, int i10) {
            q.i(view, "view");
            this.view = view;
            this.startVisibility = view.getVisibility();
            this.viewDrawable = DragLinearLayout.this.getDragDrawable(view);
            this.position = i10;
            this.startTop = view.getTop();
            this.height = view.getHeight();
            this.totalDragOffset = 0;
            this.targetTopOffset = 0;
            this.settleAnimation = null;
            this.detecting = true;
        }

        public final void stopDetecting() {
            this.detecting = false;
            View view = this.view;
            if (view != null && view != null) {
                view.setVisibility(this.startVisibility);
            }
            this.view = null;
            this.startVisibility = -1;
            this.viewDrawable = null;
            this.position = -1;
            this.startTop = -1;
            this.height = -1;
            this.totalDragOffset = 0;
            this.targetTopOffset = 0;
            ValueAnimator valueAnimator = this.settleAnimation;
            if (valueAnimator != null && valueAnimator != null) {
                valueAnimator.end();
            }
            this.settleAnimation = null;
        }

        public final void updateTargetTop() {
            int i10;
            int i11 = this.startTop;
            View view = this.view;
            if (view != null) {
                i10 = view.getTop();
            } else {
                i10 = 0;
            }
            this.targetTopOffset = (i11 - i10) + this.totalDragOffset;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DragLinearLayout.kt */
    /* loaded from: classes4.dex */
    public static final class DraggableChild {
        private ValueAnimator swapAnimation;

        public final void cancelExistingAnimation() {
            ValueAnimator valueAnimator = this.swapAnimation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }

        public final void endExistingAnimation() {
            ValueAnimator valueAnimator = this.swapAnimation;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }

        public final ValueAnimator getSwapAnimation() {
            return this.swapAnimation;
        }

        public final void setSwapAnimation(ValueAnimator valueAnimator) {
            this.swapAnimation = valueAnimator;
        }
    }

    /* compiled from: DragLinearLayout.kt */
    /* loaded from: classes4.dex */
    public interface OnViewSwapListener {
        void onSwap(View view, int i10, View view2, int i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DragLinearLayout(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.DragLinearLayout.<init>(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BitmapDrawable getDragDrawable(View view) {
        int top = view.getTop();
        int left = view.getLeft();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Companion.getBitmapFromView(view));
        bitmapDrawable.setBounds(new Rect(left, top, view.getWidth() + left, view.getHeight() + top));
        return bitmapDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTranslateAnimationDuration(float f10) {
        return Math.min((long) MAX_SWITCH_DURATION, Math.max(150L, (((float) 150) * Math.abs(f10)) / this.nominalDistanceScaled));
    }

    private final void handleContainerScroll(int i10) {
        final int i11;
        ScrollView scrollView = this.containerScrollView;
        if (scrollView != null) {
            q.f(scrollView);
            final int scrollY = scrollView.getScrollY();
            int top = (getTop() - scrollY) + i10;
            ScrollView scrollView2 = this.containerScrollView;
            q.f(scrollView2);
            int height = scrollView2.getHeight();
            int i12 = this.scrollSensitiveHeight;
            if (top < i12) {
                i11 = (int) ((-16) * Companion.smootherStep(i12, 0.0f, top));
            } else if (top > height - i12) {
                i11 = (int) (16 * Companion.smootherStep(height - i12, height, top));
            } else {
                i11 = 0;
            }
            ScrollView scrollView3 = this.containerScrollView;
            if (scrollView3 != null) {
                scrollView3.removeCallbacks(this.dragUpdater);
            }
            ScrollView scrollView4 = this.containerScrollView;
            if (scrollView4 != null) {
                scrollView4.smoothScrollBy(0, i11);
            }
            Runnable runnable = new Runnable() { // from class: com.habitrpg.android.habitica.ui.views.c
                @Override // java.lang.Runnable
                public final void run() {
                    DragLinearLayout.handleContainerScroll$lambda$1(DragLinearLayout.this, scrollY, i11);
                }
            };
            this.dragUpdater = runnable;
            ScrollView scrollView5 = this.containerScrollView;
            if (scrollView5 != null) {
                scrollView5.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleContainerScroll$lambda$1(DragLinearLayout dragLinearLayout, int i10, int i11) {
        q.i(dragLinearLayout, "this$0");
        if (dragLinearLayout.draggedItem.getDragging()) {
            ScrollView scrollView = dragLinearLayout.containerScrollView;
            q.f(scrollView);
            if (i10 != scrollView.getScrollY()) {
                dragLinearLayout.onDrag(dragLinearLayout.draggedItem.getTotalDragOffset() + i11);
            }
        }
    }

    private final int nextDraggablePosition(int i10) {
        int indexOfKey = this.draggableChildren.indexOfKey(i10);
        if (indexOfKey < -1 || indexOfKey > this.draggableChildren.size() - 2) {
            return -1;
        }
        return this.draggableChildren.keyAt(indexOfKey + 1);
    }

    private final void onDrag(int i10) {
        boolean z10;
        final View view;
        this.draggedItem.setTotalOffset(i10);
        invalidate();
        int startTop = this.draggedItem.getStartTop() + this.draggedItem.getTotalDragOffset();
        handleContainerScroll(startTop);
        int nextDraggablePosition = nextDraggablePosition(this.draggedItem.getPosition());
        int previousDraggablePosition = previousDraggablePosition(this.draggedItem.getPosition());
        View childAt = getChildAt(nextDraggablePosition);
        View childAt2 = getChildAt(previousDraggablePosition);
        boolean z11 = false;
        if (childAt != null && this.draggedItem.getHeight() + startTop > childAt.getTop() + (childAt.getHeight() / 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (childAt2 != null && startTop < childAt2.getTop() + (childAt2.getHeight() / 2)) {
            z11 = true;
        }
        if (z10 || z11) {
            if (z10) {
                view = childAt;
            } else {
                view = childAt2;
            }
            final int position = this.draggedItem.getPosition();
            if (!z10) {
                nextDraggablePosition = previousDraggablePosition;
            }
            this.draggableChildren.get(nextDraggablePosition).cancelExistingAnimation();
            final float y10 = view.getY();
            OnViewSwapListener onViewSwapListener = this.swapListener;
            if (onViewSwapListener != null && onViewSwapListener != null) {
                View view2 = this.draggedItem.getView();
                int position2 = this.draggedItem.getPosition();
                q.f(view);
                onViewSwapListener.onSwap(view2, position2, view, nextDraggablePosition);
            }
            if (z10) {
                removeViewAt(position);
                removeViewAt(nextDraggablePosition - 1);
                addView(childAt, position);
                addView(this.draggedItem.getView(), nextDraggablePosition);
            } else {
                removeViewAt(nextDraggablePosition);
                removeViewAt(position - 1);
                addView(this.draggedItem.getView(), nextDraggablePosition);
                addView(childAt2, position);
            }
            this.draggedItem.setPosition(nextDraggablePosition);
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.habitrpg.android.habitica.ui.views.DragLinearLayout$onDrag$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    long translateAnimationDuration;
                    viewTreeObserver.removeOnPreDrawListener(this);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "y", y10, r0.getTop());
                    translateAnimationDuration = this.getTranslateAnimationDuration(view.getTop() - y10);
                    final ObjectAnimator duration = ofFloat.setDuration(translateAnimationDuration);
                    q.h(duration, "setDuration(...)");
                    final DragLinearLayout dragLinearLayout = this;
                    final int i11 = position;
                    duration.addListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.views.DragLinearLayout$onDrag$1$onPreDraw$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            SparseArray sparseArray;
                            q.i(animator, "animation");
                            sparseArray = DragLinearLayout.this.draggableChildren;
                            ((DragLinearLayout.DraggableChild) sparseArray.get(i11)).setSwapAnimation(null);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            SparseArray sparseArray;
                            q.i(animator, "animation");
                            sparseArray = DragLinearLayout.this.draggableChildren;
                            ((DragLinearLayout.DraggableChild) sparseArray.get(i11)).setSwapAnimation(duration);
                        }
                    });
                    duration.start();
                    return true;
                }
            });
            View view3 = this.draggedItem.getView();
            q.f(view3);
            final ViewTreeObserver viewTreeObserver2 = view3.getViewTreeObserver();
            viewTreeObserver2.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.habitrpg.android.habitica.ui.views.DragLinearLayout$onDrag$2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    DragLinearLayout.DragItem dragItem;
                    DragLinearLayout.DragItem dragItem2;
                    String str;
                    DragLinearLayout.DragItem dragItem3;
                    DragLinearLayout.DragItem dragItem4;
                    viewTreeObserver2.removeOnPreDrawListener(this);
                    dragItem = this.draggedItem;
                    dragItem.updateTargetTop();
                    dragItem2 = this.draggedItem;
                    if (dragItem2.settling()) {
                        str = DragLinearLayout.LOG_TAG;
                        Log.d(str, "Updating settle animation");
                        dragItem3 = this.draggedItem;
                        ValueAnimator settleAnimation = dragItem3.getSettleAnimation();
                        q.f(settleAnimation);
                        settleAnimation.removeAllListeners();
                        dragItem4 = this.draggedItem;
                        ValueAnimator settleAnimation2 = dragItem4.getSettleAnimation();
                        q.f(settleAnimation2);
                        settleAnimation2.cancel();
                        this.onDragStop();
                        return true;
                    }
                    return true;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDragStop() {
        this.draggedItem.setSettleAnimation(ValueAnimator.ofFloat(r0.getTotalDragOffset(), this.draggedItem.getTotalDragOffset() - this.draggedItem.getTargetTopOffset()).setDuration(getTranslateAnimationDuration(this.draggedItem.getTargetTopOffset())));
        ValueAnimator settleAnimation = this.draggedItem.getSettleAnimation();
        if (settleAnimation != null) {
            settleAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.habitrpg.android.habitica.ui.views.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DragLinearLayout.onDragStop$lambda$0(DragLinearLayout.this, valueAnimator);
                }
            });
        }
        ValueAnimator settleAnimation2 = this.draggedItem.getSettleAnimation();
        if (settleAnimation2 != null) {
            settleAnimation2.addListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.views.DragLinearLayout$onDragStop$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    DragLinearLayout.DragItem dragItem;
                    DragLinearLayout.DragItem dragItem2;
                    DragLinearLayout.DragItem dragItem3;
                    Drawable drawable;
                    Drawable drawable2;
                    Drawable drawable3;
                    q.i(animator, "animation");
                    dragItem = DragLinearLayout.this.draggedItem;
                    if (dragItem.getDetecting()) {
                        dragItem2 = DragLinearLayout.this.draggedItem;
                        dragItem2.setSettleAnimation(null);
                        dragItem3 = DragLinearLayout.this.draggedItem;
                        dragItem3.stopDetecting();
                        drawable = DragLinearLayout.this.dragTopShadowDrawable;
                        if (drawable != null) {
                            drawable3 = DragLinearLayout.this.dragTopShadowDrawable;
                            drawable3.setAlpha(255);
                        }
                        drawable2 = DragLinearLayout.this.dragBottomShadowDrawable;
                        if (drawable2 != null) {
                            drawable2.setAlpha(255);
                        }
                        if (DragLinearLayout.this.getLayoutTransition() != null && DragLinearLayout.this.getLayoutTransition() == null) {
                            DragLinearLayout dragLinearLayout = DragLinearLayout.this;
                            dragLinearLayout.setLayoutTransition(dragLinearLayout.getLayoutTransition());
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    DragLinearLayout.DragItem dragItem;
                    q.i(animator, "animation");
                    dragItem = DragLinearLayout.this.draggedItem;
                    dragItem.onDragStop();
                }
            });
        }
        ValueAnimator settleAnimation3 = this.draggedItem.getSettleAnimation();
        if (settleAnimation3 != null) {
            settleAnimation3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDragStop$lambda$0(DragLinearLayout dragLinearLayout, ValueAnimator valueAnimator) {
        Float f10;
        int i10;
        q.i(dragLinearLayout, "this$0");
        q.i(valueAnimator, "animation");
        if (!dragLinearLayout.draggedItem.getDetecting()) {
            return;
        }
        DragItem dragItem = dragLinearLayout.draggedItem;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f10 = (Float) animatedValue;
        } else {
            f10 = null;
        }
        if (f10 != null) {
            i10 = (int) f10.floatValue();
        } else {
            i10 = 0;
        }
        dragItem.setTotalOffset(i10);
        int animatedFraction = (int) ((1 - valueAnimator.getAnimatedFraction()) * 255);
        Drawable drawable = dragLinearLayout.dragTopShadowDrawable;
        if (drawable != null) {
            drawable.setAlpha(animatedFraction);
        }
        Drawable drawable2 = dragLinearLayout.dragBottomShadowDrawable;
        if (drawable2 != null) {
            drawable2.setAlpha(animatedFraction);
        }
        dragLinearLayout.invalidate();
    }

    private final void onTouchEnd() {
        this.downY = -1;
        this.activePointerId = -1;
    }

    private final int previousDraggablePosition(int i10) {
        int indexOfKey = this.draggableChildren.indexOfKey(i10);
        if (indexOfKey >= 1 && indexOfKey <= this.draggableChildren.size()) {
            return this.draggableChildren.keyAt(indexOfKey - 1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDetectingDrag(View view) {
        if (this.draggedItem.getDetecting()) {
            return;
        }
        int indexOfChild = indexOfChild(view);
        this.draggableChildren.get(indexOfChild).endExistingAnimation();
        this.draggedItem.startDetectingOnPossibleDrag(view, indexOfChild);
        ScrollView scrollView = this.containerScrollView;
        if (scrollView != null) {
            scrollView.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void startDrag() {
        setLayoutTransition(getLayoutTransition());
        if (getLayoutTransition() != null) {
            setLayoutTransition(null);
        }
        this.draggedItem.onDragStart();
        requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        q.i(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.draggedItem.getDetecting()) {
            if (this.draggedItem.getDragging() || this.draggedItem.settling()) {
                canvas.save();
                canvas.translate(0.0f, this.draggedItem.getTotalDragOffset());
                BitmapDrawable viewDrawable = this.draggedItem.getViewDrawable();
                if (viewDrawable != null) {
                    viewDrawable.draw(canvas);
                }
                BitmapDrawable viewDrawable2 = this.draggedItem.getViewDrawable();
                int i13 = 0;
                if (viewDrawable2 != null && (bounds4 = viewDrawable2.getBounds()) != null) {
                    i10 = bounds4.left;
                } else {
                    i10 = 0;
                }
                BitmapDrawable viewDrawable3 = this.draggedItem.getViewDrawable();
                if (viewDrawable3 != null && (bounds3 = viewDrawable3.getBounds()) != null) {
                    i11 = bounds3.right;
                } else {
                    i11 = 0;
                }
                BitmapDrawable viewDrawable4 = this.draggedItem.getViewDrawable();
                if (viewDrawable4 != null && (bounds2 = viewDrawable4.getBounds()) != null) {
                    i12 = bounds2.top;
                } else {
                    i12 = 0;
                }
                BitmapDrawable viewDrawable5 = this.draggedItem.getViewDrawable();
                if (viewDrawable5 != null && (bounds = viewDrawable5.getBounds()) != null) {
                    i13 = bounds.bottom;
                }
                Drawable drawable = this.dragBottomShadowDrawable;
                if (drawable != null) {
                    drawable.setBounds(i10, i13, i11, this.dragShadowHeight + i13);
                }
                Drawable drawable2 = this.dragBottomShadowDrawable;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = this.dragTopShadowDrawable;
                if (drawable3 != null) {
                    drawable3.setBounds(i10, i12 - this.dragShadowHeight, i11, i12);
                    this.dragTopShadowDrawable.draw(canvas);
                }
                canvas.restore();
            }
        }
    }

    public final int getScrollSensitiveHeight() {
        return this.scrollSensitiveHeight;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q.i(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 6 || motionEvent.getPointerId(motionEvent.getActionIndex()) != this.activePointerId) {
                            return false;
                        }
                        onTouchEnd();
                        if (this.draggedItem.getDetecting()) {
                            this.draggedItem.stopDetecting();
                        }
                        return false;
                    }
                } else if (!this.draggedItem.getDetecting() || -1 == this.activePointerId || Math.abs(motionEvent.getY() - this.downY) <= this.slop) {
                    return false;
                } else {
                    startDrag();
                    return true;
                }
            }
            onTouchEnd();
            if (this.draggedItem.getDetecting()) {
                this.draggedItem.stopDetecting();
            }
        } else if (this.draggedItem.getDetecting()) {
            return false;
        } else {
            this.downY = (int) motionEvent.getY();
            this.activePointerId = motionEvent.getPointerId(0);
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        q.i(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 6 || motionEvent.getPointerId(motionEvent.getActionIndex()) != this.activePointerId) {
                            return false;
                        }
                        onTouchEnd();
                        if (this.draggedItem.getDragging()) {
                            onDragStop();
                        } else if (this.draggedItem.getDetecting()) {
                            this.draggedItem.stopDetecting();
                        }
                        return true;
                    }
                } else if (!this.draggedItem.getDragging() || -1 == (i10 = this.activePointerId)) {
                    return false;
                } else {
                    onDrag(((int) motionEvent.getY(motionEvent.findPointerIndex(i10))) - this.downY);
                    return true;
                }
            }
            onTouchEnd();
            if (this.draggedItem.getDragging()) {
                onDragStop();
            } else if (this.draggedItem.getDetecting()) {
                this.draggedItem.stopDetecting();
            }
            return true;
        } else if (!this.draggedItem.getDetecting() || this.draggedItem.settling()) {
            return false;
        } else {
            startDrag();
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        this.draggableChildren.clear();
    }

    public final void removeViewDraggable(View view) {
        q.i(view, "child");
        if (this == view.getParent()) {
            this.draggableChildren.remove(indexOfChild(view));
            this.draggableChildren.put(indexOfChild(view), new DraggableChild());
        }
    }

    public final void setOnViewSwapListener(OnViewSwapListener onViewSwapListener) {
        q.i(onViewSwapListener, "swapListener");
        this.swapListener = onViewSwapListener;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 0) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("DragLinearLayout must be VERTICAL.");
    }

    public final void setScrollSensitiveHeight(int i10) {
        this.scrollSensitiveHeight = i10;
    }

    public final void setViewDraggable(View view, View view2) {
        q.i(view, "child");
        q.i(view2, "dragHandle");
        if (this == view.getParent()) {
            view2.setOnTouchListener(new DragHandleOnTouchListener(this, view));
            this.draggableChildren.put(indexOfChild(view), new DraggableChild());
            return;
        }
        Log.e(LOG_TAG, view + " is not a child, cannot make draggable.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        this.downY = -1;
        this.activePointerId = -1;
        setOrientation(1);
        this.draggableChildren = new SparseArray<>();
        this.draggedItem = new DragItem();
        this.slop = ViewConfiguration.get(context).getScaledTouchSlop();
        Resources resources = getResources();
        this.dragTopShadowDrawable = androidx.core.content.a.e(context, R.drawable.ab_solid_shadow_holo_flipped);
        this.dragBottomShadowDrawable = androidx.core.content.a.e(context, R.drawable.ab_solid_shadow_holo);
        this.dragShadowHeight = resources.getDimensionPixelSize(R.dimen.downwards_drop_shadow_height);
        this.scrollSensitiveHeight = (int) ((48 * resources.getDisplayMetrics().density) + 0.5f);
        this.nominalDistanceScaled = (int) ((resources.getDisplayMetrics().density * NOMINAL_DISTANCE) + 0.5f);
    }

    public /* synthetic */ DragLinearLayout(Context context, AttributeSet attributeSet, int i10, qc.h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
