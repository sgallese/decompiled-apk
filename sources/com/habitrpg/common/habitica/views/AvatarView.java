package com.habitrpg.common.habitica.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.s;
import b5.h;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.AppConfigManager;
import com.habitrpg.shared.habitica.models.Avatar;
import com.habitrpg.shared.habitica.models.AvatarBuffs;
import com.habitrpg.shared.habitica.models.AvatarHair;
import com.habitrpg.shared.habitica.models.AvatarOutfit;
import com.habitrpg.shared.habitica.models.AvatarPreferences;
import com.habitrpg.shared.habitica.models.AvatarStats;
import dc.w;
import ec.n0;
import g5.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import jc.b;
import pc.l;
import q4.g;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: AvatarView.kt */
/* loaded from: classes4.dex */
public final class AvatarView extends FrameLayout {
    private Avatar avatar;
    private Bitmap avatarBitmap;
    private Canvas avatarCanvas;
    private l<? super Bitmap, w> avatarImageConsumer;
    private final Matrix avatarMatrix;
    private RectF avatarRectF;
    private Map<LayerType, String> currentLayers;
    private boolean hasBackground;
    private boolean hasMount;
    private boolean hasPet;
    private final List<ImageView> imageViewHolder;
    private Date lastSubstitutionCheck;
    private final AtomicInteger numberLayersInProcess;
    private Map<LayerType, String> preview;
    private boolean showBackground;
    private boolean showMount;
    private boolean showPet;
    private boolean showSleeping;
    private Map<String, ? extends Map<String, String>> spriteSubstitutions;
    public static final Companion Companion = new Companion(null);
    private static final Rect FULL_HERO_RECT = new Rect(0, 0, 140, 147);
    private static final Rect COMPACT_HERO_RECT = new Rect(0, 0, 114, 114);
    private static final Rect HERO_ONLY_RECT = new Rect(0, 0, 90, 90);

    /* compiled from: AvatarView.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: AvatarView.kt */
    /* loaded from: classes4.dex */
    public static final class LayerType {
        private static final /* synthetic */ jc.a $ENTRIES;
        private static final /* synthetic */ LayerType[] $VALUES;
        public static final LayerType BACKGROUND = new LayerType("BACKGROUND", 0);
        public static final LayerType MOUNT_BODY = new LayerType("MOUNT_BODY", 1);
        public static final LayerType CHAIR = new LayerType("CHAIR", 2);
        public static final LayerType BACK = new LayerType("BACK", 3);
        public static final LayerType SKIN = new LayerType("SKIN", 4);
        public static final LayerType SHIRT = new LayerType("SHIRT", 5);
        public static final LayerType ARMOR = new LayerType("ARMOR", 6);
        public static final LayerType HEAD_0 = new LayerType("HEAD_0", 7);
        public static final LayerType HAIR_BASE = new LayerType("HAIR_BASE", 8);
        public static final LayerType HAIR_BANGS = new LayerType("HAIR_BANGS", 9);
        public static final LayerType HAIR_MUSTACHE = new LayerType("HAIR_MUSTACHE", 10);
        public static final LayerType HAIR_BEARD = new LayerType("HAIR_BEARD", 11);
        public static final LayerType BODY = new LayerType("BODY", 12);
        public static final LayerType EYEWEAR = new LayerType("EYEWEAR", 13);
        public static final LayerType VISUAL_BUFF = new LayerType("VISUAL_BUFF", 14);
        public static final LayerType HEAD = new LayerType("HEAD", 15);
        public static final LayerType HEAD_ACCESSORY = new LayerType("HEAD_ACCESSORY", 16);
        public static final LayerType HAIR_FLOWER = new LayerType("HAIR_FLOWER", 17);
        public static final LayerType SHIELD = new LayerType("SHIELD", 18);
        public static final LayerType WEAPON = new LayerType("WEAPON", 19);
        public static final LayerType MOUNT_HEAD = new LayerType("MOUNT_HEAD", 20);
        public static final LayerType ZZZ = new LayerType("ZZZ", 21);
        public static final LayerType PET = new LayerType("PET", 22);

        private static final /* synthetic */ LayerType[] $values() {
            return new LayerType[]{BACKGROUND, MOUNT_BODY, CHAIR, BACK, SKIN, SHIRT, ARMOR, HEAD_0, HAIR_BASE, HAIR_BANGS, HAIR_MUSTACHE, HAIR_BEARD, BODY, EYEWEAR, VISUAL_BUFF, HEAD, HEAD_ACCESSORY, HAIR_FLOWER, SHIELD, WEAPON, MOUNT_HEAD, ZZZ, PET};
        }

        static {
            LayerType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayerType(String str, int i10) {
            super(str, i10);
        }

        public static jc.a<LayerType> getEntries() {
            return $ENTRIES;
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) $VALUES.clone();
        }
    }

    /* compiled from: AvatarView.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayerType.values().length];
            try {
                iArr[LayerType.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayerType.MOUNT_BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayerType.MOUNT_HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayerType.CHAIR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayerType.BACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LayerType.SKIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LayerType.SHIRT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LayerType.ARMOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LayerType.BODY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LayerType.HEAD_0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LayerType.HAIR_BASE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LayerType.HAIR_BANGS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LayerType.HAIR_MUSTACHE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LayerType.HAIR_BEARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LayerType.EYEWEAR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LayerType.VISUAL_BUFF.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LayerType.HEAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LayerType.HEAD_ACCESSORY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LayerType.HAIR_FLOWER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LayerType.SHIELD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LayerType.WEAPON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LayerType.ZZZ.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LayerType.PET.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context) {
        super(context);
        q.i(context, "context");
        this.showBackground = true;
        this.showMount = true;
        this.showPet = true;
        this.showSleeping = true;
        this.imageViewHolder = new ArrayList();
        this.avatarMatrix = new Matrix();
        this.numberLayersInProcess = new AtomicInteger(0);
        this.spriteSubstitutions = new HashMap();
        init(null, 0);
    }

    private final Bitmap getAvatarImage() {
        int i10;
        int i11;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int i14;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i15;
        if (getWidth() > 0) {
            i10 = getWidth();
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 140;
            }
        }
        if (getHeight() > 0) {
            i11 = getHeight();
        } else {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                i11 = layoutParams2.height;
            } else {
                i11 = 147;
            }
        }
        if (i10 <= 0) {
            i10 = IntExtensionsKt.dpToPx(140, getContext());
        }
        if (i11 <= 0) {
            i11 = IntExtensionsKt.dpToPx(147, getContext());
        }
        Rect rect = new Rect(0, 0, i10, i11);
        if (rect.isEmpty()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        this.avatarBitmap = createBitmap;
        if (createBitmap != null) {
            this.avatarCanvas = new Canvas(createBitmap);
        }
        for (ImageView imageView : this.imageViewHolder) {
            imageView.getLayoutParams();
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null) {
                bitmap = bitmapDrawable.getBitmap();
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                q.f(bitmap);
                Canvas canvas = this.avatarCanvas;
                if (canvas != null) {
                    Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        i12 = s.b((ViewGroup.MarginLayoutParams) layoutParams3);
                    } else {
                        i12 = 0;
                    }
                    ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        i13 = marginLayoutParams.topMargin;
                    } else {
                        i13 = 0;
                    }
                    int width = bitmap.getWidth();
                    ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                    if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                        i14 = s.b((ViewGroup.MarginLayoutParams) layoutParams5);
                    } else {
                        i14 = 0;
                    }
                    int i16 = width + i14;
                    int height = bitmap.getHeight();
                    ViewGroup.LayoutParams layoutParams6 = imageView.getLayoutParams();
                    if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    } else {
                        marginLayoutParams2 = null;
                    }
                    if (marginLayoutParams2 != null) {
                        i15 = marginLayoutParams2.topMargin;
                    } else {
                        i15 = 0;
                    }
                    canvas.drawBitmap(bitmap, rect2, new Rect(i12, i13, i16, height + i15), (Paint) null);
                }
            }
        }
        return this.avatarBitmap;
    }

    private final EnumMap<LayerType, String> getAvatarLayerMap(Avatar avatar, Map<String, ? extends Map<String, String>> map) {
        AvatarOutfit equipped;
        boolean z10;
        String str;
        boolean u10;
        AvatarBuffs buffs;
        String str2;
        String str3;
        EnumMap<LayerType, String> enumMap = new EnumMap<>(LayerType.class);
        if (!avatar.isValid()) {
            return enumMap;
        }
        AvatarPreferences preferences = avatar.getPreferences();
        if (preferences == null) {
            return enumMap;
        }
        if (preferences.getCostume()) {
            equipped = avatar.getCostume();
        } else {
            equipped = avatar.getEquipped();
        }
        AvatarStats stats = avatar.getStats();
        String str4 = null;
        boolean z11 = false;
        if (stats != null && (buffs = stats.getBuffs()) != null) {
            Boolean snowball = buffs.getSnowball();
            Boolean bool = Boolean.TRUE;
            if (q.d(snowball, bool)) {
                LayerType layerType = LayerType.VISUAL_BUFF;
                AvatarStats stats2 = avatar.getStats();
                if (stats2 != null) {
                    str3 = stats2.getHabitClass();
                } else {
                    str3 = null;
                }
                enumMap.put((EnumMap<LayerType, String>) layerType, (LayerType) ("avatar_snowball_" + str3));
                z10 = true;
            } else {
                z10 = false;
            }
            if (q.d(buffs.getSeafoam(), bool)) {
                enumMap.put((EnumMap<LayerType, String>) LayerType.VISUAL_BUFF, (LayerType) "seafoam_star");
                z10 = true;
            }
            if (q.d(buffs.getShinySeed(), bool)) {
                LayerType layerType2 = LayerType.VISUAL_BUFF;
                AvatarStats stats3 = avatar.getStats();
                if (stats3 != null) {
                    str2 = stats3.getHabitClass();
                } else {
                    str2 = null;
                }
                enumMap.put((EnumMap<LayerType, String>) layerType2, (LayerType) ("avatar_floral_" + str2));
                z10 = true;
            }
            if (q.d(buffs.getSpookySparkles(), bool)) {
                enumMap.put((EnumMap<LayerType, String>) LayerType.VISUAL_BUFF, (LayerType) "ghost");
                z10 = true;
            }
        } else {
            z10 = false;
        }
        Map<String, String> map2 = map.get("visualBuff");
        if (map2 != null) {
            str4 = map2.get("full");
        }
        if (str4 != null) {
            enumMap.put((EnumMap<LayerType, String>) LayerType.VISUAL_BUFF, (LayerType) str4);
            z10 = true;
        }
        AvatarHair hair = preferences.getHair();
        if (!z10) {
            String chair = preferences.getChair();
            if (chair != null) {
                u10 = v.u(chair);
                if ((!u10) == true) {
                    z11 = true;
                }
            }
            if (z11 && !q.d(preferences.getChair(), "chair_none")) {
                enumMap.put((EnumMap<LayerType, String>) LayerType.CHAIR, (LayerType) preferences.getChair());
            }
            String str5 = "broad";
            if (equipped != null) {
                if (!TextUtils.isEmpty(equipped.getBack()) && !q.d("back_base_0", equipped.getBack())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.BACK, (LayerType) equipped.getBack());
                }
                if (equipped.isAvailable(equipped.getArmor())) {
                    LayerType layerType3 = LayerType.ARMOR;
                    String size = preferences.getSize();
                    if (size == null) {
                        size = "broad";
                    }
                    enumMap.put((EnumMap<LayerType, String>) layerType3, (LayerType) (size + "_" + equipped.getArmor()));
                }
                if (equipped.isAvailable(equipped.getBody())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.BODY, (LayerType) equipped.getBody());
                }
                if (equipped.isAvailable(equipped.getEyeWear())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.EYEWEAR, (LayerType) equipped.getEyeWear());
                }
                if (equipped.isAvailable(equipped.getHead())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.HEAD, (LayerType) equipped.getHead());
                }
                if (equipped.isAvailable(equipped.getHeadAccessory())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.HEAD_ACCESSORY, (LayerType) equipped.getHeadAccessory());
                }
                if (equipped.isAvailable(equipped.getShield())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.SHIELD, (LayerType) equipped.getShield());
                }
                if (equipped.isAvailable(equipped.getWeapon())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.WEAPON, (LayerType) equipped.getWeapon());
                }
            }
            LayerType layerType4 = LayerType.SKIN;
            String skin = preferences.getSkin();
            if (preferences.getSleep()) {
                str = "_sleep";
            } else {
                str = "";
            }
            enumMap.put((EnumMap<LayerType, String>) layerType4, (LayerType) ("skin_" + skin + str));
            LayerType layerType5 = LayerType.SHIRT;
            String size2 = preferences.getSize();
            if (size2 != null) {
                str5 = size2;
            }
            enumMap.put((EnumMap<LayerType, String>) layerType5, (LayerType) (str5 + "_shirt_" + preferences.getShirt()));
            enumMap.put((EnumMap<LayerType, String>) LayerType.HEAD_0, (LayerType) "head_0");
            if (hair != null) {
                String color = hair.getColor();
                if (hair.isAvailable(hair.getBase())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.HAIR_BASE, (LayerType) ("hair_base_" + hair.getBase() + "_" + color));
                }
                if (hair.isAvailable(hair.getBangs())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.HAIR_BANGS, (LayerType) ("hair_bangs_" + hair.getBangs() + "_" + color));
                }
                if (hair.isAvailable(hair.getMustache())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.HAIR_MUSTACHE, (LayerType) ("hair_mustache_" + hair.getMustache() + "_" + color));
                }
                if (hair.isAvailable(hair.getBeard())) {
                    enumMap.put((EnumMap<LayerType, String>) LayerType.HAIR_BEARD, (LayerType) ("hair_beard_" + hair.getBeard() + "_" + color));
                }
            }
        }
        if (hair != null && hair.isAvailable(hair.getFlower())) {
            enumMap.put((EnumMap<LayerType, String>) LayerType.HAIR_FLOWER, (LayerType) ("hair_flower_" + hair.getFlower()));
        }
        return enumMap;
    }

    public final Rect getLayerBounds(LayerType layerType, String str, Drawable drawable) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        boolean K;
        boolean z10 = false;
        Rect rect = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF = new RectF(rect);
        if (q.d(str, "weapon_special_critical")) {
            if (!this.showMount && !this.showPet) {
                if (this.showBackground) {
                    pointF = new PointF(-12.0f, 30.0f);
                } else {
                    pointF = new PointF(-12.0f, 12.0f);
                }
            } else if (this.hasMount) {
                pointF = new PointF(13.0f, 12.0f);
            } else if (this.hasPet) {
                pointF = new PointF(13.0f, 36.5f);
            } else {
                pointF = new PointF(13.0f, 40.0f);
            }
        } else {
            pointF = null;
        }
        if (pointF == null) {
            switch (WhenMappings.$EnumSwitchMapping$0[layerType.ordinal()]) {
                case 1:
                    if (!this.showMount && !this.showPet) {
                        pointF = new PointF(-25.0f, 0.0f);
                        break;
                    }
                    break;
                case 2:
                case 3:
                    pointF = new PointF(24.0f, 18.0f);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!this.showMount && !this.showPet) {
                        if (this.showBackground) {
                            pointF = new PointF(0.0f, 18.0f);
                            break;
                        }
                    } else {
                        if (this.hasMount) {
                            String str2 = getLayerMap().get(LayerType.MOUNT_HEAD);
                            if (str2 != null) {
                                K = yc.w.K(str2, "Kangaroo", false, 2, null);
                                if (K) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                pointF3 = new PointF(24.0f, 18.0f);
                            } else {
                                pointF3 = new PointF(24.0f, 0.0f);
                            }
                        } else if (this.hasPet) {
                            pointF3 = new PointF(24.0f, 24.0f);
                        } else {
                            pointF3 = new PointF(24.0f, 28.0f);
                        }
                        pointF = pointF3;
                        break;
                    }
                    break;
                case 23:
                    pointF = new PointF(0.0f, FULL_HERO_RECT.height() - rect.height());
                    break;
            }
        }
        if (pointF != null) {
            switch (str.hashCode()) {
                case -817640505:
                    if (str.equals("weapon_special_0")) {
                        pointF2 = new PointF(pointF.x - 12, pointF.y + 4);
                        pointF = pointF2;
                        break;
                    }
                    break;
                case -817640504:
                    if (str.equals("weapon_special_1")) {
                        pointF2 = new PointF(pointF.x - 12, pointF.y + 4);
                        pointF = pointF2;
                        break;
                    }
                    break;
                case 833483403:
                    if (str.equals("head_special_0")) {
                        pointF2 = new PointF(pointF.x - 3, pointF.y - 18);
                        pointF = pointF2;
                        break;
                    }
                    break;
                case 833483404:
                    if (str.equals("head_special_1")) {
                        pointF2 = new PointF(pointF.x, pointF.y + 3);
                        pointF = pointF2;
                        break;
                    }
                    break;
                case 1478411304:
                    if (str.equals("weapon_special_critical")) {
                        pointF2 = new PointF(pointF.x - 12, pointF.y + 4);
                        pointF = pointF2;
                        break;
                    }
                    break;
            }
            Matrix matrix = new Matrix();
            matrix.setTranslate(pointF.x, pointF.y);
            matrix.mapRect(rectF);
        }
        this.avatarMatrix.mapRect(rectF);
        rectF.round(rect);
        return rect;
    }

    private final Map<LayerType, String> getLayerMap() {
        Map<LayerType, String> h10;
        Avatar avatar = this.avatar;
        if (avatar == null) {
            h10 = n0.h();
            return h10;
        }
        return getLayerMap(avatar, true);
    }

    private final Rect getOriginalRect() {
        if (!this.showMount && !this.showPet) {
            if (this.showBackground) {
                return COMPACT_HERO_RECT;
            }
            return HERO_ONLY_RECT;
        }
        return FULL_HERO_RECT;
    }

    private final Map<String, Map<String, String>> getSpriteSubstitutions() {
        long j10;
        long time = new Date().getTime();
        Date date = this.lastSubstitutionCheck;
        if (date != null) {
            j10 = date.getTime();
        } else {
            j10 = 0;
        }
        if (time - j10 > 180000) {
            this.spriteSubstitutions = new AppConfigManager().spriteSubstitutions();
            this.lastSubstitutionCheck = new Date();
        }
        return this.spriteSubstitutions;
    }

    private final void init(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AvatarView, i10, 0);
        q.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.showBackground = obtainStyledAttributes.getBoolean(R.styleable.AvatarView_showBackground, true);
            this.showMount = obtainStyledAttributes.getBoolean(R.styleable.AvatarView_showMount, true);
            this.showPet = obtainStyledAttributes.getBoolean(R.styleable.AvatarView_showPet, true);
            this.showSleeping = obtainStyledAttributes.getBoolean(R.styleable.AvatarView_showSleeping, true);
            obtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void initAvatarRectMatrix() {
        int i10;
        int i11;
        float dpToPx;
        if (this.avatarRectF == null) {
            Rect originalRect = getOriginalRect();
            if (getWidth() > 0) {
                i10 = getWidth();
            } else {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    i10 = layoutParams.width;
                } else {
                    i10 = 140;
                }
            }
            if (getHeight() > 0) {
                i11 = getHeight();
            } else {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                if (layoutParams2 != null) {
                    i11 = layoutParams2.height;
                } else {
                    i11 = 147;
                }
            }
            if (i10 <= 0) {
                i10 = IntExtensionsKt.dpToPx(140, getContext());
            }
            float f10 = i10;
            if (i11 > 0) {
                dpToPx = i11;
            } else {
                dpToPx = IntExtensionsKt.dpToPx(147, getContext());
            }
            this.avatarRectF = new RectF(0.0f, 0.0f, f10, dpToPx);
            this.avatarMatrix.setRectToRect(new RectF(originalRect), this.avatarRectF, Matrix.ScaleToFit.START);
            RectF rectF = new RectF(originalRect);
            this.avatarRectF = rectF;
            this.avatarMatrix.mapRect(rectF);
        }
    }

    public final void onLayerComplete() {
        l<? super Bitmap, w> lVar;
        if (this.numberLayersInProcess.decrementAndGet() == 0 && (lVar = this.avatarImageConsumer) != null) {
            lVar.invoke(getAvatarImage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAvatar$default(AvatarView avatarView, Avatar avatar, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        avatarView.setAvatar(avatar, map);
    }

    private final void showLayers(Map<LayerType, String> map) {
        final ImageView imageView;
        this.currentLayers = map;
        this.numberLayersInProcess.set(map.size());
        int i10 = 0;
        for (Map.Entry<LayerType, String> entry : map.entrySet()) {
            final LayerType key = entry.getKey();
            final String value = entry.getValue();
            int i11 = i10 + 1;
            if (this.imageViewHolder.size() <= i10) {
                imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                addView(imageView);
                this.imageViewHolder.add(imageView);
            } else {
                imageView = this.imageViewHolder.get(i10);
            }
            if (!q.d(imageView.getTag(), value)) {
                imageView.setTag(value);
                m.a(imageView);
                imageView.setImageResource(0);
                String str = DataBindingUtils.BASE_IMAGE_URL + DataBindingUtils.getFullFilename$default(DataBindingUtils.INSTANCE, value, null, 2, null);
                g a10 = q4.a.a(imageView.getContext());
                h.a m10 = new h.a(imageView.getContext()).c(str).m(imageView);
                m10.a(false);
                m10.n(new d5.b() { // from class: com.habitrpg.common.habitica.views.AvatarView$showLayers$1$1
                    @Override // d5.b
                    public void onError(Drawable drawable) {
                        d5.a.a(this, drawable);
                        imageView.setImageDrawable(drawable);
                        this.onLayerComplete();
                    }

                    @Override // d5.b
                    public /* bridge */ /* synthetic */ void onStart(Drawable drawable) {
                        d5.a.b(this, drawable);
                    }

                    @Override // d5.b
                    public void onSuccess(Drawable drawable) {
                        Rect layerBounds;
                        Matrix matrix;
                        FrameLayout.LayoutParams layoutParams;
                        q.i(drawable, "result");
                        drawable.setFilterBitmap(false);
                        d5.a.c(this, drawable);
                        imageView.setImageDrawable(drawable);
                        if (drawable instanceof Animatable) {
                            ((Animatable) drawable).start();
                        }
                        layerBounds = this.getLayerBounds(key, value, drawable);
                        ImageView imageView2 = imageView;
                        matrix = this.avatarMatrix;
                        imageView2.setImageMatrix(matrix);
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams != null) {
                            layoutParams.topMargin = layerBounds.top;
                        }
                        if (layoutParams != null) {
                            layoutParams.setMarginStart(layerBounds.left);
                        }
                        if (layoutParams != null) {
                            layoutParams.width = layerBounds.right;
                        }
                        if (layoutParams != null) {
                            layoutParams.height = layerBounds.bottom;
                        }
                        imageView.setLayoutParams(layoutParams);
                        this.onLayerComplete();
                    }
                });
                a10.c(m10.b());
            }
            i10 = i11;
        }
        while (i10 < this.imageViewHolder.size()) {
            m.a(this.imageViewHolder.get(i10));
            this.imageViewHolder.get(i10).setImageResource(0);
            this.imageViewHolder.get(i10).setTag(null);
            i10++;
        }
    }

    private final String substituteOrReturn(Map<String, String> map, String str) {
        Collection<String> arrayList;
        boolean K;
        String str2;
        Set<String> keySet;
        if (map != null && (keySet = map.keySet()) != null) {
            arrayList = keySet;
        } else {
            arrayList = new ArrayList();
        }
        for (String str3 : arrayList) {
            K = yc.w.K(str, str3, false, 2, null);
            if (K) {
                if (map != null && (str2 = map.get(str3)) != null) {
                    return str2;
                }
                return str;
            }
        }
        return str;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        q.i(drawable, "drawable");
        invalidate();
        Canvas canvas = this.avatarCanvas;
        if (canvas != null) {
            draw(canvas);
        }
    }

    public final void onAvatarImageReady(l<? super Bitmap, w> lVar) {
        q.i(lVar, "consumer");
        this.avatarImageConsumer = lVar;
        if (this.imageViewHolder.size() > 0 && this.numberLayersInProcess.get() == 0) {
            l<? super Bitmap, w> lVar2 = this.avatarImageConsumer;
            if (lVar2 != null) {
                lVar2.invoke(getAvatarImage());
                return;
            }
            return;
        }
        initAvatarRectMatrix();
        showLayers(getLayerMap());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        q.i(canvas, "canvas");
        super.onDraw(canvas);
        initAvatarRectMatrix();
        Avatar avatar = this.avatar;
        boolean z10 = false;
        if (avatar != null && avatar.isValid()) {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        showLayers(getLayerMap());
    }

    public final void setAvatar(Avatar avatar, Map<LayerType, String> map) {
        q.i(avatar, NavigationDrawerFragment.SIDEBAR_AVATAR);
        Avatar avatar2 = this.avatar;
        this.avatar = avatar;
        if (map != null) {
            this.preview = map;
        }
        boolean z10 = false;
        if (avatar2 != null) {
            z10 = q.d(this.currentLayers, getLayerMap(avatar, false));
        }
        if (!z10) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<com.habitrpg.common.habitica.views.AvatarView.LayerType, java.lang.String> getLayerMap(com.habitrpg.shared.habitica.models.Avatar r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.common.habitica.views.AvatarView.getLayerMap(com.habitrpg.shared.habitica.models.Avatar, boolean):java.util.Map");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        this.showBackground = true;
        this.showMount = true;
        this.showPet = true;
        this.showSleeping = true;
        this.imageViewHolder = new ArrayList();
        this.avatarMatrix = new Matrix();
        this.numberLayersInProcess = new AtomicInteger(0);
        this.spriteSubstitutions = new HashMap();
        init(attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        this.showBackground = true;
        this.showMount = true;
        this.showPet = true;
        this.showSleeping = true;
        this.imageViewHolder = new ArrayList();
        this.avatarMatrix = new Matrix();
        this.numberLayersInProcess = new AtomicInteger(0);
        this.spriteSubstitutions = new HashMap();
        init(attributeSet, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        q.i(context, "context");
        this.showBackground = true;
        this.showMount = true;
        this.showPet = true;
        this.showSleeping = true;
        this.imageViewHolder = new ArrayList();
        this.avatarMatrix = new Matrix();
        this.numberLayersInProcess = new AtomicInteger(0);
        this.spriteSubstitutions = new HashMap();
        this.showBackground = z10;
        this.showMount = z11;
        this.showPet = z12;
    }
}
