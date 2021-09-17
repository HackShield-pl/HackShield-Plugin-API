package pl.hackshield.plugin.api;

import java.util.Collection;
import java.util.UUID;

public interface HackShieldAPI {

    HsUser getUser(UUID minecraftUuid);

    Collection<HsUser> getUsers();

    void sendPackets(HsUser hsUser, Collection<HsPacket> packets);

    /**
     * Only proxy
     *
     * @param serverName server name used in Proxy's config.yml
     * @return {@code boolean} true if added server successful
     */
    default boolean addPassiveVerificationServer(String serverName) {
        throw new UnsupportedOperationException("The method is available only on the proxy server!");
    }

    /**
     * Only proxy
     *
     * @param serverName server name used in Proxy's config.yml
     * @return {@code boolean} true if removed server successful
     */
    default boolean removePassiveVerificationServer(String serverName) {
        throw new UnsupportedOperationException("The method is available only on the proxy server!");
    }

}
