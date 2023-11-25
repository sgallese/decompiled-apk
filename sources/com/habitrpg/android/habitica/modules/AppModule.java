package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.preference.k;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.SoundFileLoader;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.common.habitica.helpers.KeyHelper;
import com.habitrpg.shared.habitica.HLogger;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import qc.q;

/* compiled from: AppModule.kt */
/* loaded from: classes4.dex */
public final class AppModule {
    public static final int $stable = 0;

    public final KeyHelper provideKeyHelper(Context context, SharedPreferences sharedPreferences, KeyStore keyStore) {
        q.i(context, "context");
        q.i(sharedPreferences, "sharedPreferences");
        if (keyStore == null) {
            return null;
        }
        return KeyHelper.Companion.getInstance(context, sharedPreferences, keyStore);
    }

    public final KeyStore provideKeyStore() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e10) {
            HLogger.Companion.logException("KeyHelper", "Error initializing", e10);
            return null;
        } catch (KeyStoreException e11) {
            HLogger.Companion.logException("KeyHelper", "Error initializing", e11);
            return null;
        } catch (NoSuchAlgorithmException e12) {
            HLogger.Companion.logException("KeyHelper", "Error initializing", e12);
            return null;
        } catch (CertificateException e13) {
            HLogger.Companion.logException("KeyHelper", "Error initializing", e13);
            return null;
        }
    }

    public final SharedPreferences provideSharedPreferences(Context context) {
        q.i(context, "context");
        SharedPreferences b10 = k.b(context);
        q.h(b10, "getDefaultSharedPreferences(...)");
        return b10;
    }

    public final AuthenticationHandler providesAuthenticationHandler(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "sharedPreferences");
        return new AuthenticationHandler(sharedPreferences);
    }

    public final AppConfigManager providesRemoteConfigManager(ContentRepository contentRepository) {
        return new AppConfigManager(contentRepository);
    }

    public final Resources providesResources(Context context) {
        q.i(context, "context");
        Resources resources = context.getResources();
        q.h(resources, "getResources(...)");
        return resources;
    }

    public final ReviewManager providesReviewManager(Context context, AppConfigManager appConfigManager) {
        q.i(context, "context");
        q.i(appConfigManager, "configManager");
        return new ReviewManager(context, appConfigManager);
    }

    public final SoundFileLoader providesSoundFileLoader(Context context) {
        q.i(context, "context");
        return new SoundFileLoader(context);
    }

    public final PushNotificationManager pushNotificationManager(ApiClient apiClient, SharedPreferences sharedPreferences, Context context) {
        q.i(apiClient, "apiClient");
        q.i(sharedPreferences, "sharedPreferences");
        q.i(context, "context");
        return new PushNotificationManager(apiClient, sharedPreferences, context);
    }
}
