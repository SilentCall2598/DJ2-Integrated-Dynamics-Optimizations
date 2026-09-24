# Integrated Dynamics Optimizations

A targeted performance optimization mod for the Integrated Dynamics ecosystem.

Initial development and validation happen in Divine Journey 2 on
Minecraft 1.12.2. The project name and scope are intentionally broader than
that single modpack.

## Initial target environment

- Minecraft 1.12.2
- Forge 14.23.5.2860
- Integrated Dynamics 1.1.11
- Integrated Tunnels 1.6.14
- Cyclops Core 1.6.7
- Common Capabilities 2.4.8
- Integrated NBT 1.2.2
- Integrated Derivative 1.1.2

## Status

Early development.

The first investigation focuses on the failed-transfer cache used by
`TunnelHelpers.moveSingleStateOptimized`.

The current phase is measurement and verification. No production optimization
is enabled yet.

Future targets will be selected from measured performance data rather than
assumed from the wider Integrated Dynamics scope.
