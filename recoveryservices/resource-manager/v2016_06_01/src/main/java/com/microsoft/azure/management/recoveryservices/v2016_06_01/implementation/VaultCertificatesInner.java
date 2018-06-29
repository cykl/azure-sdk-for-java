/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.CertificateRequest;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.RawCertificateData;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VaultCertificates.
 */
public class VaultCertificatesInner {
    /** The Retrofit service to perform REST calls. */
    private VaultCertificatesService service;
    /** The service client containing this operation class. */
    private RecoveryServicesClientImpl client;

    /**
     * Initializes an instance of VaultCertificatesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VaultCertificatesInner(Retrofit retrofit, RecoveryServicesClientImpl client) {
        this.service = retrofit.create(VaultCertificatesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VaultCertificates to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VaultCertificatesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.v2016_06_01.VaultCertificates create" })
        @PUT("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/certificates/{certificateName}")
        Observable<Response<ResponseBody>> create(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("certificateName") String certificateName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CertificateRequest certificateRequest, @Header("User-Agent") String userAgent);

    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VaultCertificateResponseInner object if successful.
     */
    public VaultCertificateResponseInner create(String resourceGroupName, String vaultName, String certificateName) {
        return createWithServiceResponseAsync(resourceGroupName, vaultName, certificateName).toBlocking().single().body();
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VaultCertificateResponseInner> createAsync(String resourceGroupName, String vaultName, String certificateName, final ServiceCallback<VaultCertificateResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, vaultName, certificateName), serviceCallback);
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultCertificateResponseInner object
     */
    public Observable<VaultCertificateResponseInner> createAsync(String resourceGroupName, String vaultName, String certificateName) {
        return createWithServiceResponseAsync(resourceGroupName, vaultName, certificateName).map(new Func1<ServiceResponse<VaultCertificateResponseInner>, VaultCertificateResponseInner>() {
            @Override
            public VaultCertificateResponseInner call(ServiceResponse<VaultCertificateResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultCertificateResponseInner object
     */
    public Observable<ServiceResponse<VaultCertificateResponseInner>> createWithServiceResponseAsync(String resourceGroupName, String vaultName, String certificateName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (certificateName == null) {
            throw new IllegalArgumentException("Parameter certificateName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final RawCertificateData properties = null;
        CertificateRequest certificateRequest = new CertificateRequest();
        certificateRequest.withProperties(null);
        return service.create(this.client.subscriptionId(), resourceGroupName, vaultName, certificateName, this.client.apiVersion(), this.client.acceptLanguage(), certificateRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VaultCertificateResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<VaultCertificateResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VaultCertificateResponseInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param properties the RawCertificateData value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VaultCertificateResponseInner object if successful.
     */
    public VaultCertificateResponseInner create(String resourceGroupName, String vaultName, String certificateName, RawCertificateData properties) {
        return createWithServiceResponseAsync(resourceGroupName, vaultName, certificateName, properties).toBlocking().single().body();
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param properties the RawCertificateData value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VaultCertificateResponseInner> createAsync(String resourceGroupName, String vaultName, String certificateName, RawCertificateData properties, final ServiceCallback<VaultCertificateResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, vaultName, certificateName, properties), serviceCallback);
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param properties the RawCertificateData value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultCertificateResponseInner object
     */
    public Observable<VaultCertificateResponseInner> createAsync(String resourceGroupName, String vaultName, String certificateName, RawCertificateData properties) {
        return createWithServiceResponseAsync(resourceGroupName, vaultName, certificateName, properties).map(new Func1<ServiceResponse<VaultCertificateResponseInner>, VaultCertificateResponseInner>() {
            @Override
            public VaultCertificateResponseInner call(ServiceResponse<VaultCertificateResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Uploads a certificate for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param certificateName Certificate friendly name.
     * @param properties the RawCertificateData value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultCertificateResponseInner object
     */
    public Observable<ServiceResponse<VaultCertificateResponseInner>> createWithServiceResponseAsync(String resourceGroupName, String vaultName, String certificateName, RawCertificateData properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (certificateName == null) {
            throw new IllegalArgumentException("Parameter certificateName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(properties);
        CertificateRequest certificateRequest = new CertificateRequest();
        certificateRequest.withProperties(properties);
        return service.create(this.client.subscriptionId(), resourceGroupName, vaultName, certificateName, this.client.apiVersion(), this.client.acceptLanguage(), certificateRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VaultCertificateResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<VaultCertificateResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VaultCertificateResponseInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VaultCertificateResponseInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VaultCertificateResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VaultCertificateResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
